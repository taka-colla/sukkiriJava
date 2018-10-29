package chapter9;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) {
		String original = args[0];
		String copyTo = args[1];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		GZIPOutputStream gos =null;

		try {
			fis = new FileInputStream(original);
			fos = new FileOutputStream(copyTo);
			bos = new BufferedOutputStream(fos);
			gos = new GZIPOutputStream(bos);
			int i = fis.read();
			while( i != -1) {
				gos.write(i);
				fis.read();
			}
			gos.flush();
			gos.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			try {
				if(fis != null) {
					fis.close();
				}
				if(gos != null) {
					gos.close();
				}
			}catch(IOException e2) {}
		}

	}
}

