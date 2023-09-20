package RepeatClass;

public class ConstructorCarDemo {

	public static void main(String[] args) {
		
		// how do we create and initialize an object.
		
		ConstructorCar c = new ConstructorCar();
		//ConstructorCar c1 = new ConstructorCar("Ford","Fiesta" , 1423);
		c.make= "Toyota";
		c.model= "Camry";
		c.year= 2022;
		
		c.printDetails(); // it will print details above
		
		//with parameterized constructor	
		//we can not leave the parameters blank
		/*you could do 
	 	c2.make;
		c2.model;
		c2.year; and leave between parenthesis blank
		*/
		ConstructorCar c2 = new ConstructorCar( "BMW", "M5", 2021);
		c2.printDetails();	

		//lets create a new random one
		ConstructorCar c3 = new ConstructorCar();
		c3.make= "VW";
		c3.model= "Tiguan";
		c3.year= 2023;
		c3.printDetails();
		
		//if i create an object with parameters, default constructor will be omitted)
		ConstructorCar c4= new ConstructorCar("Honda", "Odyssey", 2022);
		c4.printDetails();
		
	}
}
 