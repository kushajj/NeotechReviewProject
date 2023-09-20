package RepeatClass;

public class Repeat1 {

	public static void main(String[] args) {
		
		String name= "Huso";
		String lastName= "Kus";
		double grade= 4.8;
		String city= "Naples";
		String state= "FL";
		String phoneNumber;
		city= "Mardin";
		state= "Guneydogu Anadolu";
		phoneNumber= "2381221421";
		
		System.out.println("My name is "+ name + " and my last name is "+ lastName +"."
				+ " I live in the city of "+ city +", " + "state of "+ state + " and"
						+ " my phone number is: "+ phoneNumber+".");
		
		
		//Arithmetic Operations/order of operations
		//write a program to print the area and the perimeter of a rectangle with width= 5; and height=8;
		//Your program should say 'the perimeter of a rectangle with width --- and height--- is equal to --
		//and the area is ---
		// a*b;
		// 2*(a+b);
		int width= 5;
		int height= 8;
		double areaofRec= (width*height);
		double perimeterOfARectangle=2*(width+height);
		
		System.out.println("The perimeter of a regtangle is--> "+ perimeterOfARectangle + " and the area is --> "+ areaofRec);
		

		//modulus operator
		int remainder= height%width;
		System.out.println(remainder);
		
		int c= 23;
		
		if( c%2==0) {
			System.out.println(c+" is an even number");
		}else {
			System.out.println(c+ " is an odd number");
		}
		
		
		/*
		 Write a program to display the area and the perimeter
		 of a circle radius of 5; pi=3;
		 
		 Write a java prog to convert mile to km
		 use scale 1 m= 1.609344.
		 print the conversion on the console
		 for example 10 miles is 16.09344 km
		 */
		
		int r = 5;
		int p= 3;
		
		int areaOfACircle= (r*r)*p;
		int perimeterOfACircle= 2*r*p;
		
		System.out.println("Area of a circle is "+ areaOfACircle + " perimeter of a circle is " + perimeterOfACircle);
		
	    double scale=1.609344;
	    double km, mile;
	    mile= 2;
	    km= mile*scale;
	    
		System.out.println(mile + " miles is "+km);
		double km2, m2;
		km2= 60;
		m2= km2/scale;
		
		System.out.println(m2);
		
		/*
		 Create a int variable named number1, assign the value of 500.
		 Store assign number1 into a byte name number2
		 Re-assign the number 1 into number 2
		 Print the value of number and check if it is 500;
		 What if initial value was 50?
		 */
		int number1 =500;
		byte number2= (byte)number1; //narrowing //putting the type mandatory
		System.out.println(number2);
		number1=number2;
		System.out.println(number1);
		
		//with 500 you do not see changes on the value;
		
		int numero= 100;
		
		if ( numero> 150) {
		System.out.println("number is big");
	} else {
		System.out.println("number is small");
	}
		
		numero= 1550;
		if(numero>1000) {
			System.out.println("number is big");
		}else {
			System.out.println("number is small");
		}
		
		//elif has 100000 in her account
		
		int account = 9000;
		if(account<10000) {
			System.out.println("Elif cant afford a new car");
			
		}else {
			System.out.println("Elif can buy brand new car");
		}
		
		
		// you should practice java 15 hours a week. 
		//if you practice 15 or more you will love java
		//otherwise you wont love it.
		
		int hours= 22;
		if(hours>=15) {
			System.out.println("you will love Java");
		}else {
			System.out.println("you wont love it");
			
	/*		
			1. Create a Java program and name it Double Comparison.
			Declare 2 double values and if value of first variable is higher then the second,
			print “Double value __ is larger than __ .”
			Otherwise print...


			2. Create a Java program and name it Temperature Check.
			Create variable to store temperature.
			Your program should check if temperature is below 32
			If temperature is below
			    then it should print “Water will freeze with temperature __”,
			    otherwise “Water will NOT freeze with temperature __”.
	*/		    
		}

}}