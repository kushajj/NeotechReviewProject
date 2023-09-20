package RepeatClass;

public class InheritanceTeacher {
	
	String name, major;
	int yearOfGraduation;
	
	public void teach() {
		System.out.println(name+ " is passionate about teaching");
		System.out.println(name= " 's major is "+ major );
		
	}
	public void doExam() {
		System.out.println(name+ " does exams");
	}
	public void printInfo(){
		System.out.println("Teacher " + name + " with "+ major + " degree was graduated in "+ yearOfGraduation);
	}


public class PianoTeacher extends InheritanceTeacher{
	
		String brand = "Org";
		
}
public static void main(String[] args) {
	
	MathTeacher m = new MathTeacher();
	
}


	
}
