package RepeatClass;

public class ConstructorStudent {
	//write a program that takes students name and 3 subject grades.
	//inside your class also have a method to calculate average grade
	//test student class for 5 different students with different marks
	//your program should print an average mark of each student
	
	String stdName;
	double grade1, grade2, grade3;
	double avg;
	
	ConstructorStudent() {
		System.out.println("Default");
		//does not need to create this.
		
	}
	ConstructorStudent(String newStdName, double g1, double g2, double g3){
		System.out.println("Parameterized constructor");
		stdName= newStdName;
		grade1= g1;
		grade2= g2;
		grade3= g3;
		//double avg = (grade1+ grade2+ grade3)/3;
		
	}
	void printAverage() {
		double avg = (grade1+ grade2+ grade3)/3;
		System.out.println("Average grade of "+ stdName + " is: "+ avg);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorStudent std1 = new ConstructorStudent("Huso", 89, 88, 99);
		std1.printAverage();
		
		ConstructorStudent std2= new ConstructorStudent("Abril", 96, 96, 94);
		std2.printAverage();
		
		ConstructorStudent std3= new ConstructorStudent("Ahmet", 93, 93, 94);
		std3.printAverage();
		
		//reassign
		std1.grade1= 100;
		std1.printAverage();
	}
}
