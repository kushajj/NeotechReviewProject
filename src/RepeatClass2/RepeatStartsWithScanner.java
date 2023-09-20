package RepeatClass2;

import java.util.Scanner;

public class RepeatStartsWithScanner {
	

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("enter your age,salary,name, surname and gender");
	
	
	int age = scan.nextInt();
	double salary = scan.nextDouble();
	String name = scan.next();
	String surname = scan.next();
	String fullName= name+" "+ surname;
	char gender = scan.next().charAt(0);
	
	System.out.println("My name is "+ fullName+". I am "+ age+ "years old. I work as a "
			+ "AQ engineer and my salary is "+ salary+".");

	
	//Ask user to enter height in inches
	/*
	 * if shorter than 60 inch, short
	 * if between 60-72 inch, medium
	 * if taller than 72 inch, tall
	 */
	
	System.out.println("Enter your height");
	double height = scan.nextDouble();
	
	if(height==0 && height<60) {
		System.out.println("short");
	}else if(height>=60 && height<72) {
		System.out.println("medium");
		
	}else if(height >=72) {
		System.out.println("tall");
	
	}else {
		System.out.println("Invalid height. Please enter your height again");
	}
	
	
	//Write a program that will ask for the day number 1-7
	//if any day from 1 to 5 its a weekday
	//if 6-7 output weekend
	//any other day output "invalid day:
	
	System.out.println("Enter a day");
	int day = scan.nextInt();
	if(day>0 && day<6) {
		System.out.println("Weekday");
	}else if(day==6&& day==7) {
		System.out.println("Weekend");
		
	}else {
		System.out.println("invalid day");
	}
	
	//create a java program that will ask user to enter city and temperature. your prog should 
	//convert f to celcius then print the city name and  temp in the city
	String city;
	double f, c;
	System.out.println("enter the temperature in F");
	city = scan.next();
	f = scan.nextDouble();
	c =(f-32)*5/9;
	System.out.println("temp in the the city of "+ city + " is "+ c+ "C");
	}
}

