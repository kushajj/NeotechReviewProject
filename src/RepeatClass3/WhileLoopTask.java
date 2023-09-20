package RepeatClass3;

public class WhileLoopTask {

	public static void main(String[] args) {
		boolean workDay = true;
		int day = 1;

		// While Loop Task
		// create a boolean variable workDay and assign it true
		// create int variable day and assign it to 1
		// as long is its a workDay print "i need a day off" and
		// increase the day.. once the day is 6 print i do not need a day
		// off anymore

//
//		while (workDay) {
//			if (day < 6) {
//				System.out.println("I need a day off");
//			} else {
//				System.out.println("I do not need a day off");
//				workDay = false;
//			}
//			day++;

//		}
		System.out.println("Second Solution");
		int day2 = 1;

		while (day2 < 6) {
			System.out.println("I need a day off");
			day2++;
		}
		System.out.println("I dont need a day off");
	}

}
