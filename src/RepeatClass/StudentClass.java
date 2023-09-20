package RepeatClass;

public class StudentClass {
	/*Homework 1:
	    Write program as a Student class that has instance variables name and address. 
	    Create a constructor that will initialize those variables. 
	    Print name & address of given student using displayInfo method.
	*/
	
	String name;
	String address;
	
	StudentClass(){
		
	}
	
	StudentClass(String name, String address){ // if you dont wanna change the name use this.
		this.name= name;
		this.address= address;
		
	}
	void displayInfo() {
		System.out.println(this.name +" "+this.address);
	}
	
	public static void main(String[] args) {
		
		StudentClass obj = new StudentClass("Huseyin", "Inegol 16400 Baby");
		obj.displayInfo();
		
	}
}
