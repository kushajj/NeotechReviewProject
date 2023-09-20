package RepeatClass;

public class ConstructorRepeat {

	
		
		String name;
		int age;
		
		//name is exactly the same as Class.
		
		ConstructorRepeat() {
			System.out.println("I am the default constructor");
			
		}
	
		public static void main(String[] args) {
			//create the object
			
			//object type
			
			ConstructorRepeat con = new ConstructorRepeat();
			//it has 2 properties name and age
			
			System.out.println(con.age);//it hasnt initialized so its gonna print
			//the default value which is 0. for string its null
			con.name= "Dogukan";
			con.age = 27;
			
			System.out.println(con.name + " " + con.age);
		//if you do 
			//System.out.println(name+age);
			//it wont let you, you need to show your properties	
	    //it constructs your object.
			
			
			
			
			
}
}