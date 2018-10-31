package chapter18;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {

	private static MyLogger theInstance; //唯一のインスタンス保存用
	private FileWriter writer;

	private MyLogger() {
		try {
			this.writer = new FileWriter("c:\\dummlog.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log(String msg) throws IOException {
		this.writer.write(msg);
	}

	public static MyLogger getInstance() {
		if(theInstance == null) {
			theInstance = new MyLogger();
		}
		return theInstance;
	}

}
