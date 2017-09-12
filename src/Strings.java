
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" I am Awesome ";
		String str1=" I am the best";
		String str2;
		String str3;
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.indexOf("am"));
		System.out.println(str.trim());
		System.out.println(str1.replace("best", "Taste"));
		System.out.println("Sub String" + str1.substring(0, 5));
		str2= (str.concat(str1));
		str3= str2 + str1;
		System.out.println("Contact Strin" + str2);
		System.out.println(str3);
	
		char[] charArray=str.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{
			System.out.println("Index" + i + "is:" +charArray[i]);
		}

	}

}
