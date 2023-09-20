package RepeatClass2;

import java.util.Scanner;

public class SwitchRepeat {

	public static void main(String[] args) {

		//Write a program that will ask for the day number 1-7
		//if any day from 1 to 5 its a weekday
		//if 6-7 output weekend
		//any other day output "invalid day:
		
		int day = 6;
		
		//using switch case
		switch (day) // we write switch, then put variable between the paranthesis
		//then open block with curly brackets
		
		{
		case 1 : 
			System.out.println("Monday");
			break; //ends the execution if condition is right
		case 2 : 
			System.out.println("Tuesday");
			break;			
		case 3 : 
			System.out.println("Wednesday");
			break;		
		case 4 : 
			System.out.println("Thursday");
			break;	
		case 5 : 
			System.out.println("Friday");
			break;
		case 6 : 
			System.out.println("Saturday");
			break;
		case 7:	
			System.out.println("Sunday");
			break;
			
			default: //its like saying 'else' here.. otherwise
				System.out.println("Invalid");
			break;	
		}
		

	

	//Ask a user to enter their country and then print the language they speak
	Scanner input = new Scanner(System.in);
	System.out.println("Where are you from");
	String country = input.next();
	
	switch (country) {
	
	case "Turkiye" : 
		System.out.println("You speak Turkish");
		break;
	
	case "USA":
	case "UK":
	case "Australia":	
		System.out.println("You speak English");
		break;
		
	case "Italy":
		System.out.println("You speak Italian");
		break;
	
	case "Russia":
		System.out.println("You speak Russian");
		break;
		
		default:
		System.out.println("I dont know what language you speak");
		break;
			
			
	}
	
}
}