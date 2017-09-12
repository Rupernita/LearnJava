
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping");
		System.out.println("first number " + a);
		System.out.println("second number " + b);
		
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping");
		System.out.println("first number " + a);
		System.out.println("second number " + b);
	}

}
