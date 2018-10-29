package chapter10;

import java.io.Serializable;

public class Department implements Serializable{
	private String name;
	private Employee leader;

	Department(String name){
		this.name = name;
		this.leader = new Employee("名無し");
	}

	Department(String name,Employee leader){
		this.name = name;
		this.leader = leader;
	}
}
