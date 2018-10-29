package chapter10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {

		Employee e1 = new Employee("田中太郎",41);
		Department d1 = new Department("総務部",e1);

		FileOutputStream fos = new FileOutputStream("c:\\company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.flush();
		oos.close();

	}
}
