package RepeatClass4;

import java.util.Scanner;

public class Class9Homeworks {
	// Task1
	/*
	 * 1. Print 5 times this statement: "I love Neotech"
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("I love neotech");

		}

		System.out.println();
		System.out.println("================");
		/*
		 * 3. Print numbers from 1 to 50 except those that are divisible by 3.
		 */

		for (int i = 1; i < 50; i++) {
			if (i % 3 == 0) {
				continue;

			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("===============================");
		/*
		 * 4. Create a program that will be asking user to apply for a credit card 10
		 * times. As soon you get an "yes" from a user program should stop asking.
		 */
		Scanner input = new Scanner(System.in);
		String answer;

		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want to apply for a credit card");
			answer = input.next();

			if (answer.equalsIgnoreCase("Yes")) {
				System.out.println("You can apply now");
				break;
			}
		}

		System.out.println();
		System.out.println("===============================");
		System.out.println("write a program that ask user his username and password until users put them correcty ");

		Scanner scan = new Scanner(System.in);
		String userName = "huso";
		String userPassword = "abo";

		
		String password;  
		String name;

		do {
			System.out.println("Enter your user name and password");
			name= scan.next();
			password= scan.next();
			
			
			if (name.equalsIgnoreCase(userName) && password.equalsIgnoreCase(userPassword)) {
				System.out.println("You are logged in");
				break;
			}
		} while (true);

	}

}
