
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int idx = -1;
		int a[] = { 1,3,4,5,6,7,10};
		
		for (int i = 0; i < a.length; i++)
		{
		    if (a[i] == 0)
		    {
		         idx = i; 
		    }
		    else 
		    {
		         sum += a[i];
		    }
		}

		// the total sum of numbers between 1 and arr.length.
		int total = (a.length + 1) * a.length / 2;
		System.out.println("Total is" + total);
		System.out.println("Sum is" + sum);
		
		System.out.println("missing number is: " + (sum - total) + " at index " + idx);
	}

}
