package RepeatClass4;

public class BreakAndContinue {

	public static void main(String[] args) {
		//Break
		System.out.println("Break");
		
		for(int i= 1; i<=10; i++) {
			if(i==4) { //before it arrives to for 
				//it takes you out of loop
				break;
			}
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		System.out.println("Continue");
		for(int i=1 ;i<=10; i++) {
			if(i==4) {
				continue; //it skips 4 and keeps going
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===================");
		
		//print numbers  from 10 to 1,, skip 3,6,9
		for(int i= 10; i>=1; i--) {
			if(i==3 || i==6 || i==9) {
				continue;
			}
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("===================");
		//another way
		//all those nums are divisible by 3
		for(int i= 10; i>=1; i--) {
			if(i%3 ==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		//print numbers from 20 to 30 but skip from 23 to 28
		
		for( int i= 20; i<=30; i++) {
			if(i>=23 && i<=28) {
				continue;
			}
			System.out.println(i+" ");
			
		}
		System.out.println();
		System.out.println("===================");
		
		
	}

}
