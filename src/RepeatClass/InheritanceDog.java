package RepeatClass;

	public class InheritanceDog extends InheritanceAnimal{
		//lets give a dog a specific property beside animals general property
		String breed;

		//lets give dog a specific behaviors
		public void bark() {
			System.out.println("Only dogs bark");
			System.out.println("The breed is "+ breed);
		}
		
	}

