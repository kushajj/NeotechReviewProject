package RepeatClass4;

public class ForLoopIntro {

	public static void main(String[] args) {
	//	print numbers from 1 to 10;
		
	//for has 3 important parts
		// initialization,,,condition,,, increment
		
		for(int i= 1; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==========");
	//print numbers from 21 to 30
		
		for(int i=21; i<=30; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("Print numbers from 20 to 1 ");
		for(int i= 20; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("print odd numbers from 1 to 10");
		for(int i= 1 ; i<10; i+=2){
			//if(i%2==1) {
				System.out.print(i+" ");
			}
		System.out.println();
		//second way
		for(int i= 1; i<10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//3rd way
		for(int i= 1; i<10; i++ ) {
			System.out.print(i+" ");
			i++; //double increment
		}
		System.out.println();
		System.out.println("Calculate the sum of odd numbers from 1 to 10");
		
		int sum= 0;
		
		for(int i= 1; i<=10; i++) {
			if(i%2==1) {
				sum= sum+i;
			}
		}System.out.print(sum);
		System.out.println();
		System.out.println("========");
		
		int sum1=0;
		for(int i= 1; i<=10; i+=2) {
			sum1= sum1+i;
		}System.out.println(sum+" is the total");
		}
		}


