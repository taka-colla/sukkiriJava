package chapter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime future = now.plusDays(100);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(dtf.format(future));
	}

}
