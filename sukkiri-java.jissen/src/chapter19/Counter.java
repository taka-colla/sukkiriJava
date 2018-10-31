package chapter19;

public class Counter {
	private long count = 0;
	public void add(long i) {
		System.out.println("足し算します");
		synchronized(this){ //この一文を追加しないとスレッドセーフにならない
		this.count += i;
		} //ここまで
	}
	public void mul(long i) {
		System.out.println("掛け算します");
		synchronized(this) { //この一文を追加しないとスレッドセーフにならない
		this.count *= i;
		} //ここまで
	}

}
