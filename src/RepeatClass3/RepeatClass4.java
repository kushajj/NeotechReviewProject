package RepeatClass3;

import java.util.Scanner;

public class RepeatClass4 {

	public static void main(String[] args) {
	//Do while Task
		//ask a user to guess a number. lucky number is 5. as long as different answer given ask user
		//to enter a number until the right one is given. then print you are the winner
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		
		//Using a while loop
		
		int luckyNumber =5;
		
		int number =scan.nextInt();
		while(!(luckyNumber== number)) {
			System.out.println("Wrong number, keep trying");
			number= scan.nextInt();
		
		}System.out.println("You are the winner");
		
		//Do while is better for this 
		
		do{
			System.out.println("Guess my number");
			number= scan.nextInt();
			
		}while(number!= luckyNumber);
		System.out.println("You are the winner");
		

	}

}
