package RepeatClass;

public class MathTeacher extends  InheritanceTeacher{
	    boolean goodAtCalculating;
		
	    public void lovesGeoghraphy() {
	    	System.out.println(name + " also loves Geoghraphy");
	    }
 

	public static void main(String[] args) {
		
		MathTeacher m = new MathTeacher();
		m.name= "Huso";
		m.major= "Math";
		m.yearOfGraduation= 2021;
		m.goodAtCalculating= true;
		
		m.lovesGeoghraphy();
		m.doExam();
		m.teach();
		m.printInfo();
		
			
	}

}
