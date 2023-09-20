package RepeatClass3;

import java.util.*;

public class HomeworkSwitch {

	public static void main(String[] args) {
	
/*
Allow user to enter grade and then provide explanation: 
A-Excellent, B-Good, C-Average, D-Bad, 
any other grade --> Not Acceptable. 
At the end your program should print which grade was entered 
by the user with explanation.
*/			
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		char grade=input.next().charAt(0);
		
		switch(grade) {
		case 'A': 
			System.out.println(grade+ " is excellent");
			break;
		case 'B':
			System.out.println(grade + " is good");
			break;
		case 'C':
			System.out.println(grade + " is average");
			break;
		case 'D':
			System.out.println(grade + " is bad");
			
		default:
			System.out.println(grade+  " is not acceptable");
			break;
			
	
			 
		
		
		
		}
		
		
	}

}
