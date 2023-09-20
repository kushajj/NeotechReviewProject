package RepeatClass3;

import java.util.Scanner;

public class WhileLoopHw2 {

	public static void main(String[] args) {
		/*
		 * 2. Write a program that asks user to enter his/her
		  username and password until user enters them correctly.
		 */
		
		Scanner scan = new Scanner (System.in);
		String correctUserName= "Abuzer";
		String correctPassword= "Kadayif";

		
		while(true) {
			System.out.println("enter username");
			String enteredUserName= scan.nextLine();
			
			System.out.println("enter your password");
			String enteredPassword= scan.nextLine();
			
			if(enteredUserName.equals(correctUserName)&& enteredPassword.equals(correctPassword)) {
				System.out.println("You succesfully logged in");
				break;
				
			}else {
				System.out.println("Invalid username or password. try again");
			}
		}
	}
}
		