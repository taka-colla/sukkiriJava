package chapter17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {
	private String title;
	private Date releaseDate;

	public Movie() {}

	public Movie(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setReleaseDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			this.releaseDate = sdf.parse(date);
		} catch (Exception e) {
			System.out.println("日付の表記が不正です");
			e.printStackTrace();
		}
	}

	public String getReleaseDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(this.releaseDate);
	}



}
