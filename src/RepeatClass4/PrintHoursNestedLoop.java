package RepeatClass4;

public class PrintHoursNestedLoop {

	public static void main(String[] args) {
		//print the whole combination of hours
		//00:00
		//to
		//23:59
		for(int hour= 0; hour< 24; hour++ ) {
			//System.out.println(hour);
			
			for(int min= 0; min<60; min++) {
				//System.out.println(hour+":"+min);
				
				//GOTTA PRINT 'O' FOR HOURS AND MINS THAT ARE SMALLER THAN 10
				
				if(hour<10 && min<10) {
					System.out.println("0"+hour + ":0"+min);
				
				}else if(hour<10&&min>=10){
					System.out.println("0"+hour + ":"+ min);
					
				}else if(hour>=10 && min <10) {
					System.out.println(hour+ ":"+ min+ "0");
					
				}
				else {
					System.out.println(hour+":"+min);
				}
				
				 
			}
		}

	}

}
