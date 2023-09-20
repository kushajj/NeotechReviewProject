package RepeatClass;

import java.util.Scanner;

public class HomeworksOfScannerReview {

	public static void main(String[] args) {
/*	1.Ask the user to enter the height in inches. Person should be classified as one of the following:
			• short (under 60 inch)
			• medium (between 60 -72 inch)
			• tall (over 72 inch)

2. Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
			If any day from 1-5 → output "It is a weekday"
			Any day from 6-7 → output "It is a weekend",
			Any other day → output "Invalid day"

		----------------------------------------------------------------
	These are extra examples that you don't need to submit.
Use Scanner

1. You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
 If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.

2. You are DMV representative and you need to ask customer their age.
  If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.

3. Create a Java program that will ask user to input city and temperature.
  Your program should convert Fahrenheit into celsius and print "The temperature is the city __ is __"
 */
		//Homework 1
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter your height in inches");
		int height= input.nextInt();
		if(height<60) {
			System.out.println("Short");
		}else if(height>60 && height < 72) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}
		
		//Homework 2.
		System.out.println("Please enter the day number");
		int dayNumber= input.nextInt();
		if(dayNumber>=1 && dayNumber<=5) {
			System.out.println("It's a weekday");
		}else if(dayNumber>5 & dayNumber<8) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("Invalid day");
		}	
		//Homework 3;
			System.out.println("How much money would you need");
			int amount = input.nextInt();
			if(amount>200000) {
				System.out.println("you are rejected");
			}else {
				System.out.println("your application is successful");
			}
		//Homework 4;
			System.out.println("Please enter your age for your learner's permit application");
			int age= input.nextInt();
			if(age>=18) {
				System.out.println("You can apply for your drivers license");
			}else if(age>=16 && age<18) {
				System.out.println("You can apply for learners permit");
			}else {
				System.out.println("you gotta wait");
			}
		//Homework 5;
		System.out.println("Please enter your city and temperature");
		String cityName= input.next();
		double temp= input.nextDouble();
		double tempInCelcius= (temp-32)/1.8;
		System.out.println("Temperature in the city of "+ cityName+ " is:" + tempInCelcius+ "C");
			
		
	}

}
