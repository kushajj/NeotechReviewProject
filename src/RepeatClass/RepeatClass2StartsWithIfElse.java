package RepeatClass;

import java.util.Scanner;

public class RepeatClass2StartsWithIfElse {

	public static void main(String[] args) {
	/*	1. Create a Java program and name it Double Comparison.
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
		
		double d1= 123.532;
		double d2= 123.531;
		
		if(d1>d2) {
			System.out.println("Double value of "+ d1 + " is larger than " + d2);
		}else {
			System.out.println("Double value of "+ d2 + " is larger than "+ d1);
		}
		
		//Temperature Check
		
		int temp= 40;
		
		if(temp<32) {
			System.out.println("Water will freeze with "+ temp+ " degree");
		}else {
			System.out.println("Water will not freeze with temperature "+ temp+ " degree");
		}
		
		
		//Day=
		int day= 9;
		
		
			if(day ==1) {
				System.out.println("Today is Monday and we are working");
			}else if(day==2) {
				System.out.println("Today is Tuesday and we are working");	
			}else if(day==3) {
				System.out.println("Today is Wednesday and we are working");
			}else if(day==4) {
				System.out.println("Today is Thursday and we are working");
			}else if(day==5) {
				System.out.println("Today is Friday and we are working");
			}else if(day==6 || day==7) {
				System.out.println("Its weekend and we have a break");
			}else {
				System.out.println("Invalid entry");
			}
			
			int newDay= 0;
			
			if( newDay>0 && newDay<=5) {
				System.out.println("Today is weekday");
			}else if(newDay ==6 || newDay== 7) {
				System.out.println("Today is weekend");
			}else{
				System.out.println("Wrong input");
			}
			
			/*
			  if its morning say good morning
			  if its a school day= you are at school
			  else you are at home
			  else not morning good afternoon
			 */
			boolean isMorning= false;
			boolean isSchoolDay= true;
			if(isMorning) {
				System.out.println("Good Morning");
				if(isSchoolDay) {
					System.out.println("You are at school");
				}else {
					System.out.println("You are at home");
				}
			}else {
				System.out.println("Good afternoon");
			}
			
//create a java prog to check if it s friday or not. if its friday, 
//print its friday i m gonna watch a movie. and check the date if the date is 13 print 
//i will watch scary movie if its not 13 i will watch comedy. if date is 15 i watch thriller
//if its not friday print its not friday i will Study Java.
			
			String day1= "Friday";
			//could do boolean too isFriday; true
			int date= 15;
			
			if( day1=="Friday") {
				System.out.println("It's Friday Im gonna watch a movie");
				if(date==13) {
					System.out.println("I will watch a scary movie");
				    }else if(date==15) {
					System.out.println("I will watch a thriller");
					}else {
					System.out.println("I will watch comedy");
					}
				
			}else {
				System.out.println("It's not Friday i will study Java");
			}
			
/*Write a java program if patient has allergies. if the patient doesnt have allergies
 you print you are healthy..if the patient has allergies check if it s a peanut allergy
 lactose allergy, bee allergy or seafood allergy. if true print a statement dont eat 
.... fill it up with food name
			 */
			
			boolean hasAllergies= false;
			boolean peanut= true ;
			boolean lactose= false ;
			boolean beeAllergy= true;
			boolean seafood= false;

			if(hasAllergies) {
				System.out.println("You have allergies");
				if(peanut) {
				System.out.println("Dont eat peanut");
				}if(lactose) {
					System.out.println("dont eat cheese");
				}if(beeAllergy) {
					System.out.println("Stay away from bees");
				}if(seafood) {
					System.out.println("Dont eat shrimp");
				}else {
					System.out.println("You can eat shrimp");
				}
			}else {
				System.out.println("you are healthy");
			}
			
/*Write to program to implement if else logic
 if hour is less than 12 print good morning
 if hour is greater than 12 but less than 3 print good afternoon
 if hour is greater than or equal to 3 print good evening	
 */
			
			int hour = 24;
			if (hour >0 && hour < 12) {
				System.out.println("Good morning");
			}else if( hour>12 && hour <15) {
				System.out.println("Good afternoon");
				
			}else if(hour >=15 && hour<=24) {
				System.out.println("Good evening");
			}else {
				System.out.println("Wrong info");
			}
			
			//Write a program if the number is even or odd
			Scanner scan= new Scanner(System.in);
			System.out.println("enter a number");
			int number= scan.nextInt();
			
			
			if(number%2==0) {
				System.out.println(number +" is even");
			}else {
				System.out.println(number + " is odd");
			}
			
			boolean b1= !true;
			System.out.println(b1);
			
			System.out.println(!(6>4));
			
			//SCANNER CLASS
			//ask user to enter first name and then last name then print user full name
			System.out.println("please enter your first name");
			String firstName= scan.next();
			System.out.println("please enter your last name");
			String lastName= scan.next();
			System.out.println("Full name is: "+ firstName + " "+ lastName);
			
			System.out.println("===============================");
			//ask user to enter 2 numbers and print which one is larger
			System.out.println("Please enter 2 numbers and print the larger one");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			if(num1>num2) {
				System.out.println(num1 + "is larger than "+ num2);
			}else if(num2>num1) {
				System.out.println(num2 + " is larger than "+ num1);
			}else if(num1==num2) {
				System.out.println(num1 + " is equal to "+ num2);
			}else {
				System.out.println("Invalid info, re-enter again, pls");
			}
		  }
	
	
	   
	}


