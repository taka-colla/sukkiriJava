package chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1],true);
		int i = fis.read();
		while(i != -1) {
			fos.write(i);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();

	}
}
