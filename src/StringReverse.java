import javax.sound.sampled.ReverbType;

public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="This is a Test String";
     //String str="";
     String rvrs=reverse(str);
     System.out.println(rvrs);
	}
     public static String reverse(String str){
    	 String reverse="";
    	 
    	 if(str.isEmpty() || str == null)
    	 { 
    		 System.out.println("Empty String"); 
    	 }
    	 
    	 if (str.length()<=1)
    	 {
    		 reverse=str;
    	 }
    	 
    	 else{
    		 String[] ReverseString= str.split("\\s+");
    	
    		 for(String item:ReverseString)
    		 {
    			 reverse=item +" "+ reverse;
    		 }
    		 
    	 }
    	 return reverse.trim();
     }
  
     
	}