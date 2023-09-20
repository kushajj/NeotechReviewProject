package RepeatClass3;

public class WhileLoopHomework1 {

	public static void main(String[] args) {

		// print "Sampiyon Gala" 6 times using while loop
		int number = 1;

		while (number <= 6) { // IT WILL run it as long as condition is true;
			System.out.println("Sampiyon Gala");
			number++;
		}

		System.out.println("=====================");
		int number1 = 0;
		do {
			System.out.println("Sampiyon BJK");
			number1++;

		} while (number1 < 3);

		/*
		 * 1. Write a program using while loop that calculates the sum of the even
		 * numbers between 0 and 10. 2. Write a program that asks user to enter his/her
		 * username and password until user enters them correctly.
		 */

		int num = 1;
		int sum = 0;

		while (num <= 10) {
			if (num % 2 == 0) {
				sum = sum + num;
			}
			num++;
		}
		System.out.println(sum); 
		
		
		int m= 0;
		int sum1= 0;
		
		while (m<=10)
		{
			sum1=sum1+m;
			m+=2;
		
}System.out.println(sum1);
}
}