package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		int day = cal.get(Calendar.DATE);
		cal.set(Calendar.DATE, day+100);
		Date future = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(sdf.format(future));

	}

}
