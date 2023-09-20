package RepeatClass4;

public class ForLoopTask {
	public static void main(String[] args) {
		//print numbers from 1 to 100 in line w space
		//print nums from 100 to 1
		//print even nums from 20 to 1 (2 ways)
		//print odd numbers between 20 and 50
		
		
		for(int i = 1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		for(int i=100; i>1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		for(int i=20 ; i>=1; i-=2){
			System.out.println("even nums are "+ i);
		}
		System.out.println();
		System.out.println("===================");
		
		for(int i=20; i>=1; i--) {
			if(i %2 ==0) {
				System.out.println(i+" is the even num");
			}
		}
		System.out.println();
		System.out.println("===================");
		
		for(int i= 21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===================");
		for(int i= 20; i<=50; i++) {
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
		
	}

}
