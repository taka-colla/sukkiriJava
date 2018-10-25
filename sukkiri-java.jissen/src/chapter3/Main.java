package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) {
	Hero saito = new Hero("斎藤");
	Hero suzuki = new Hero("鈴木");
	List<Hero> heroList = new ArrayList<Hero>();
	heroList.add(saito);
	heroList.add(suzuki);

	for(int i = 0; i<heroList.size();i ++) {
		System.out.println(heroList.get(i).getName());
	}



		}
}
