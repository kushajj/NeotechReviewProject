package RepeatClass4;

public class NestedLoops {

	public static void main(String[] args) {

//		if()
//		{
//			if() {
//				
//			}
//		}

		for (int i = 0; i < 5; i++) {
			// beginning of outer loop
			// System.out.print(i + " ");
			for (int j = 0; j < 5; j++) {
				// beginning of inner loop
				System.out.println("i: " + i + ", j:" + j + " ");

			} // end of inner loop
			System.out.println();
		}
	}
}
