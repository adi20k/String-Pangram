import java.util.Scanner;

class StringNotPangram  extends RuntimeException  
	{  
	    public StringNotPangram (String str)  
	    { 
	        super(str);  
	    }  
	}  
public class StringPangram {
	
	
	public static boolean allLetter(String str){
        str = str.toLowerCase();
        boolean allLetterPresent = true;
         for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
            	 throw new StringNotPangram("String is not Pangram"); 
            	//return false;                
            }
        }        
        return true;      
        	 
    }

	public static void main(String[] args) {
		String str = "Abcdefghijklmnopqrstuvwxyz12";
		System.out.println("Enter your String :");
		Scanner sc=new Scanner(System.in);
		String strNew =sc.next();
		  try  
	        {  
			  if(allLetter(strNew))
					System.out.println("String is Pangram");
	        }  
	        catch (StringNotPangram e)  
	        {  
	            System.out.println("Exception occured: " + e);  
	        }  
		

	}

}
