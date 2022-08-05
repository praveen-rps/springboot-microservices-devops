package springcore;

import java.util.Map;

public class Person {
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	String name;
	int id;
	Address address;
	
	
	public Person() {
		
	}
	public Person(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public void doService() {
		System.out.println("Person is doing some service...");
	}
}
