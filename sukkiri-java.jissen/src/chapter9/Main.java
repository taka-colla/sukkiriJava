package chapter9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args)throws IOException{

		FileWriter fw = new FileWriter("c:\\rpgsave.dat",true); // FileWriterをインスタンス化してファイルを開く trueは追記

		fw.write('A');
		fw.flush(); //ファイルを書き込んだら、閉じる前にflush()メソッドを呼び出す
		fw.close();

		FileReader fr = new FileReader("rpgsave.dat");
		System.out.println("すべてのデータを読んで表示します");
		int i = fr.read(); //一文字読み込む
		while(i != -1) { //これ以上読めるデータがない場合は-1
			char c = (char) i;
			System.out.print(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fr.close();
	}

}
