package asr.spring.jdbc.entity;

import java.util.Arrays;

public class Student {

	private String name;
	private Integer age;
	private String[] subject;
	private Address address;
	
	public Student() {
		super();
	}

	public Student(String name, Integer age, String[] subject, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String[] getSubject() {
		return subject;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subject=" + Arrays.toString(subject) + ", address="
				+ address + "]";
	}

	
	
	
}
