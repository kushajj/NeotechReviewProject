package RepeatClass;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();// you can use default constructor
		//because we created one in main class of thisKeyword
		obj.sum(10, 20);//sum of the local variables 30;
						//sum of the instance variables 0;
		//because we had not set them/initialize them.
		//if we wanna see instance variables sum
		//
		System.out.println(obj.a+ " "+ obj.b);//we still didnt set them up
		
		//create the second one with parameters
		ThisKeyword obj2= new ThisKeyword(20, 40); //sum of the instance is 60;
		obj2.sum(100, 200); //local variables is 300
		
	}
	

}
