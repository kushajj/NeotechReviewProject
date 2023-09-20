package RepeatClass;

public class ConstructorExample {
//create prog that will have a construtor with no parameters and second one with parameters
	//create a seperate test class where you will execute both of the constructor
	String str, str1;
	
	
	ConstructorExample(){
		System.out.println("Hey buddy im default constructor");
	}
	ConstructorExample(String str, String str1){
		System.out.println(str+ " loves"+ str1);
	}
}
