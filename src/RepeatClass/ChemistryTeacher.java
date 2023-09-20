package RepeatClass;

public class ChemistryTeacher extends InheritanceTeacher{
	
	boolean goodWithElements;
	
	public void cooksMeth() {
		
		System.out.println(name + " is good with elements" + " "+goodWithElements);
		System.out.println(name + " loves to cook meth." );

	}
	public static void main(String[] args) {
		ChemistryTeacher c = new ChemistryTeacher ();
		
		c.name= "Walter Motherfucking White";
		c.goodWithElements= true;
		c.major= "Chemistry";
		c.yearOfGraduation= 1999;
		
		c.cooksMeth();
		c.doExam();
		c.teach();
		
	}


	}
	


