package RepeatClass;

public class ThisKeyword {

	int a, b; //this are instance variables.
	
	ThisKeyword(){
		//default constructor. you dont have to do anything in this
	}
	ThisKeyword(int a, int b){
		
		this.a= a;
		this.b= b;   //purple ones are local variables
	}
	void sum(int a, int b) {
		System.out.println("Sum of the local variables are "+ (a + b));
		System.out.println("Sum of the instance variables are "+ (this.a+this.b));
		 
	}
}
