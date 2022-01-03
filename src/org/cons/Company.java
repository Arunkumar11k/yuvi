package org.cons;

public class Company extends Employee {
	public Company() {	
		System.out.println("child Company Default");
	}
	public Company(String name) { 
		this();
		System.out.println("Gopi");
	}
	public Company(String city,int id) {
		System.out.println("city and id"+city+id);
	}
	public static void main(String[] args) {
//		Company c=new Company("Str");
		Employee c1=new Employee();
		
	}

}
