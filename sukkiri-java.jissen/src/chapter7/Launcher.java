package chapter7;

import java.lang.reflect.Method;

public class Launcher {
	public static void main(String[] args) {
		/*1.コマンドライン引数から、次の2つの情報を受け取る
		 * ・第一引数・・・起動すべきクラスのFQCN
		 * ・第二引数・・・起動の仕方を示す文字。EまたはI*/
		String fqcn = args[0];
		String start = args[1];
        showMemory();


		try {
			Class<?>clazz = Class.forName(fqcn);
			listMethods(clazz);
			if(start.equals("E")) {
				launchExternal(clazz);
			}else if(start.equals("I")) {
				launchInternal(clazz);
			}else {
				throw new IllegalArgumentException("正しい第二引数を受け取れませんでした");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.exit(1);
		}
		showMemory();
		System.exit(0);
	}

	/*3.引数として渡されたクラスが持つすべてのメソッド名を画面に表示するメソッド*/
	public static void listMethods(Class<?> clazz) {
		System.out.println("メソッドの一覧を表示します");
		Method[] methodList = clazz.getDeclaredMethods();
		for(Method method : methodList) {
			System.out.println(method.getName());
		}
	}

	/*第二引数の値がEの場合、ProcessBuilderで別プロセスとして起動するメソッド*/
	public static void launchExternal(Class<?> clazz) throws Exception{
		ProcessBuilder pb = new ProcessBuilder("java",clazz.getName());
		Process proc = pb.start();
		proc.waitFor();//プロセスの終了まで待つ
	}

	/*第二引数の値がIの場合、リフレクションでmainメソッドを呼び出す*/
	public static void launchInternal(Class<?> clazz) throws Exception{
		Method m = clazz.getMethod("main",String[].class /*String[]のClassインスタンスを取得している*/ );
	    String[] args = {};
	    m.invoke(null,(Object)args);
	}

	/*2.現在のメモリ使用量を表示するメソッド*/
	/*1キロバイト＝1024バイト
	 * 1メガバイト ＝ 1024^2 バイト*/
	public static void showMemory() {
	long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	memory = memory / ( 1024 * 1024);
	System.out.println("現在のメモリ使用量："+memory+"MB");
	}
}
