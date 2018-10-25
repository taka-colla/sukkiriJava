package chapter1;

public class Main {

	public static void main(String[] args) {

		//今までの方法
		String str = "";

		for(int i = 1 ; i<=100; i++) {
			str += (String.valueOf(i) + ",");
		}

		String[] a = str.split(",");

		//StringBuilderを用いた場合

		StringBuilder sb = new StringBuilder();
		for(int i =1; i<=100; i ++) {
			sb.append(i);
			sb.append(",");
		}
		String s = sb.toString();

		String[] aa= s.split(",");
	}

	public String concatenatePath(String folder,String file) {
		if(!folder.endsWith("\\")){
			folder += "\\";
		}
		return folder + file;
	}
}

