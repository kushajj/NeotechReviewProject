package RepeatClass3;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		int time = 7;

		if (time < 9) {
			System.out.println("Good evening");
		}
		while (time < 12) {
			// System.out.println(time); //it will run infinite loop
			System.out.println(time);
			// time++; //will print 7 8 9 10 11
			time = time + 2; // it will print 7 9 11

		}

		// how can i print numbers between 20 and 30
		System.out.println("numbers between 20 and 30");
		int number = 20;
		while (number < 31) {

			System.out.println(number);
			number++;
		}
		// lets print the numbers between 10 and 1
		System.out.println("numbers between 10 to 1");
		number = 10;
		while (number >= 1) {
			System.out.println(number);
			number--;
		}

		// lets print even numbers from 50 to 1
		System.out.println("even numbers from 50 to 1");
		number = 50;
		while (number >= 1) {
			System.out.print(number + " ");
			number -= 2;
		}
		System.out.println();

		int number1 = 1;
		while (number1 < 50) {
			if (number1 % 2 == 0) {
				System.out.print(number1 + ",");

			}
			number1++;

		}
		System.out.println();

		// lets print odd the numbers from 10 to 44
		System.out.println("Odd numbers from 10 to 44");
		number = 10;
		while (number < 44) {
			if (number % 2 == 1) {
				System.out.print(number + ",");
			}
			number++;
		}
		System.out.println();
		// DoWhile
		// lets print the odd numbers from 11 to 43
		System.out.println("odd numbers from 11 to 43 w do while");
		number = 43;
		do {
			System.out.print(number + " ");
			number -= 2;
		} while (number >= 11);
	}}
		