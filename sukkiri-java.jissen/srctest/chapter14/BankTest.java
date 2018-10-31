package chapter14;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	//正常系「ミナト」を設定
	@Test public void nameSet() {
		Bank bank = new Bank();
		bank.setName("ミナト");
	}

	@Test public void getName() {
		Bank bank = new Bank();
		bank.setName("ミナト");
		bank.getName();
	}

	//異常系 nullを設定
	@Test public void nullSet() {
		try {
     	Bank bank = new Bank();
		bank.setName(null);
		}catch(NullPointerException e) {
			return;
		}
		fail();
	}

	//異常系 ２文字をセットするとエラーが起こるべき
	@Test public void twoCharName() {
		try {
		Bank bank = new Bank();
		bank.setName("ミナ");
		}catch(IllegalArgumentException e) {
			return;
		}
	}

}
