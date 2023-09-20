package RepeatClass;

public class InheritanceBarn extends InheritanceAnimal{

	public static void main(String[] args) {
		//go to main class to create object which is inheritance animal
		InheritanceAnimal a = new InheritanceAnimal();
		a.name= "Cubuk";
		a.color= "Turquoise";
		a.age= 5;
		
		a.sleep();
		a.displayInfo();
		//weight is 0 because we havent
		//initialized it
		
		InheritanceDog d  = new InheritanceDog();
		d.name = "Niculesku";
		d.color= "Gray";
		d.age= 2;            //rest comes from animal class
		d.breed= "Shephard"; //calls from inheritence dog
	
		d.bark(); //comes from dog class
		d.sleep(); //all rest comes from animal main class
		d.eat();
		d.displayInfo();
		
		//lets create a Cat object
		
		InheritanceCat c = new InheritanceCat();
		c.name= "Pamuk";
		c.age= 6;
		c.color= "Turuncu";
		c.weight= 10;
		
		c.eat();
		c.sleep();
		c.displayInfo();
		c.meow();
		
		InheritancePuppy p = new InheritancePuppy();
		p.age= 1;
		p.color= "beyaz"; //coming from animal
		p.name= "Ufaklik";//coming from animal
		p.breed= "Pitbull"; //coming from dog
		p.hasPottyTraining= true;//coming from puppy
		//multilevel inheritance this is.
		
		p.displayInfo();
		p.sleep();
		
		
			
		}
	}


