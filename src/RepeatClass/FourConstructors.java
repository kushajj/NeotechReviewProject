package RepeatClass;

public class FourConstructors {
	/*
	 * 	Homework 2:
	  Write a program that will have 4 different access levels of constructors and 
	  create 3 objects of this class: 1 -inside same class; 2 -from outside the class; 
	  3 -from different class inside different package and observe result.
	 */
	
	String name, city, state;
	int age;
	
	public FourConstructors(String name, String city) {
		this.name= name;
		this.city= city;
		System.out.println(name + " is from "+ city);
	}
	FourConstructors() {
		System.out.println("I am default");
	}
	private FourConstructors(int age) {
		this.age= age;
		System.out.println("age is "+ age);
		
	}
	protected FourConstructors(String state , int age) {
		this.age= age;
		this.state= state;
		System.out.println(state +"'s average age is "+ age);
		
	}
	public static void main(String[] args) {
		FourConstructors obj = new FourConstructors();
		FourConstructors obj1 = new FourConstructors("Huseyin","Naples");
		FourConstructors obj2 = new FourConstructors(34);
		FourConstructors obj3= new FourConstructors("Florida", 43);
		
		
	}
	
}
