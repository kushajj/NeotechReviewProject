package RepeatClass3;

import java.util.Scanner;

public class LargestAmong3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	//lets find the largest one amongst the 3 double numbers
	// let the user enter the numbers
		
		double a, b, c;

		System.out.println("Enter 3 numbers");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+ " is the largest");
			}
		}
		if(b>a) {
			if(b>c) {
				System.out.println(b + " is the largest");
			}
		}
		if(c>b) {
			if(c>a) {
				System.out.println(c + " is the largest");
			}
		}
		
		
		if(a>b && a>c) {
			System.out.println(a + " is the biggest number");
		
		}else if(b>a && b>c){
			System.out.println(b + " is the biggest number");
		
		}else if (c>a && c>b){
			System.out.println(c + " is the biggest number");
		
		}else {
			System.out.println("Numbers are equal");
		}
		
	}

}
