package chapter3;

import java.util.HashMap;
import java.util.Map;

public class Main {
		public static void main(String[] args) {
	Hero saito = new Hero("斎藤");
	Hero suzuki = new Hero("鈴木");

	Map<Hero,Integer> heroAndKill = new HashMap<>();
	heroAndKill.put(saito,3);
	heroAndKill.put(suzuki, 7);

	for(Hero key : heroAndKill.keySet()) {
		int value = heroAndKill.get(key);
		System.out.println(key.getName()+"が倒した敵＝"+value);
	}



		}
}
