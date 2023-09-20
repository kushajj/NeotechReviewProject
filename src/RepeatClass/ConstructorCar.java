package RepeatClass;

public class ConstructorCar {
	
	  String make, model;
	int year;
	 
	 //non argument constructor
	ConstructorCar(){
		System.out.println("Im default");
	
	}
	 	
	ConstructorCar(String carMake, String carModel, int carYear){
		System.out.println("Creating an object with parameters");
		make= carMake;
		model= carModel;
		year= carYear;
		
	}
	void printDetails() {
		System.out.println("I have a " + year + " " +make + " " +  model + " and it runs great " );
	}
	
}
