package learn.io;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
//		return "Student [name=" + name + ", age=" + age + "]";
		return getClass().getName() + '@' + Integer.toHexString(hashCode()) +"!!!";
	}
	
	
}
