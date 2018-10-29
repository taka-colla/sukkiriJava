package chapter11;

import java.io.OutputStream;
import java.net.Socket;

public class Main {
	public static void main(String[] args) {
		Socket sock = null;
		OutputStream os = null;
		try {
			sock = new Socket("smtp.example.com",60025);
			os = sock.getOutputStream();
			os.write("HELLO example.com\r\n".getBytes());
			os.write("MAIL FROM: asaka@example.com\r\n".getBytes());
			os.write("RCPT TO: minato@example.com\r\n".getBytes());
			os.write("DATA\r\n".getBytes());
			os.write("From: asaka@example.com\r\n".getBytes());
			os.write("Subject: Please send me your RPG\r\n".getBytes());
			os.write("Hello minato. I would like to play your RPG\r\n".getBytes());
			os.write("Could you please send it to me ?\r\n".getBytes());
			os.write(".".getBytes());
			os.write("QUIT".getBytes());
			os.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}finally {
			try {
				os.close();
			}catch(Exception e2) {}
		}
	}
}
