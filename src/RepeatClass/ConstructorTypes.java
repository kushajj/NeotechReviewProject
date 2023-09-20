package RepeatClass;

public class ConstructorTypes {

	
		//Constructor Types Class
		//2 properties
		
		String name;
		int age;
		
		
		
		ConstructorTypes() {
//Default Constructor
			/* - no return type, not even void
			 * - same as the class name
			 * - no parameters
			 * - no static 
			 */
			System.out.println("I'm a non-argument constructor");
		}	
	
//we can have parameters in constructor
//Signature : (String)
		ConstructorTypes(String str){
		 System.out.println("I am a constructor with a String "+ str);
	}
//signature (int)
		ConstructorTypes(int num){
			System.out.println("I am an constructor with an int: "+ num);		
	}
//signature (type of the parameter) is double 
		ConstructorTypes(double numero){
			System.out.println("I am an constructor with an int: "+ numero);
	}	
//signature is str and integer down below		
		ConstructorTypes(String str, int num ){
			System.out.println("I am an constructor with" + str + " and " + num);
	}
//signature is str, str and int
		ConstructorTypes(String str, String str2){
			System.out.println("I am an constructor with a " + str+ "and" + str);
	}
	
	
	public static void main(String[] args) {
		//lets use the default constructor
		
		ConstructorTypes ct = new ConstructorTypes();
		//this one is default so you gotta bring what you wanna print
		System.out.println(ct.name+ " , " + ct.age);
		
		ConstructorTypes ct1= new ConstructorTypes("Ogulcan"); //put a string here.
		ConstructorTypes ct2= new ConstructorTypes(15);//the one with int
		ConstructorTypes ct3= new ConstructorTypes(1.3);// the one with double
		ConstructorTypes ct4= new ConstructorTypes("Huso", 34);//one with string and int
		ConstructorTypes ct5= new ConstructorTypes("Alp", "Huso"); //2 strings
		//if you put 3 strings it wouldnt work because we didnt create a constructor
		//with 3 string signature.

 }
}