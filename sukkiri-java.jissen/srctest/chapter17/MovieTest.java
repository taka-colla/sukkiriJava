package chapter17;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	@Test public void instantiate0() {
		Movie m = new Movie();
	}

	@Test public void instantiate1() {
		Movie m = new Movie("テスト");
	}

	@Test public void get0() {
		Movie m = new Movie();
		m.setTitle("ジョーズ");
		m.setReleaseDate("2018/10/31");
		assertEquals("ジョーズ",m.getTitle());
		assertEquals("2018/10/31",m.getReleaseDate());
	}
}
