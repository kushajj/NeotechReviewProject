package RepeatClass;

public class MusicTeacher extends InheritanceTeacher {
	
	boolean goodWithNotes;
	
	public void playsGuitar() {
		System.out.println(name + " plays the guitar");
		if(goodWithNotes==false) {
			System.out.println(name+ " can not write songs");		
		}else {
			System.out.println(name+ " can write songs" );
		}
	}
	public static void main(String[] args) {
		MusicTeacher mt= new MusicTeacher();
		
		mt.goodWithNotes= true;
		mt.name= "Abril";
		mt.yearOfGraduation= 1234; 
		mt.major= "Music";
		
		mt.doExam();
		mt.playsGuitar();
		mt.printInfo();
	}

}
