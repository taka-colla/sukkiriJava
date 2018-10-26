package chapter7;

import java.util.ArrayList;

public class MemoryEater {
	public MemoryEater() {
		ArrayList<Long> elements = new ArrayList<>();
		for(int i =0; i<1280000; i++) {
			long l = i;
			elements.add(l);
		}
	}
}