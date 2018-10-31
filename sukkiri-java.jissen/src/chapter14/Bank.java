package chapter14;

public class Bank {
	private String name; //銀行名(必ず３文字以上が設定される)

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		if(newName.length() < 3) {
			try {
				throw new IllegalAccessException("名前が不正です");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		this.name = newName;
	}

}
