package chapter10;

import java.io.Serializable;

public class Employee implements Serializable{ //社員クラス
	private String name;
	private int age;

	Employee(String name){
		this.name = name;
		this.age = 0;
	}

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

}
