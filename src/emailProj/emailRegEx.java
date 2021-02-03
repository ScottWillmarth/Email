package emailProj;
import java.util.Scanner;
import java.util.regex.Pattern;

public class emailRegEx {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter a string to check if it is a proper email address:");
	    String input = myScan.next();
	    
	    //Email must start with letter/number/'_' character
	    //After initial character, any character can follow
	    //First and last characters cannot be a 'special' character 
	    String regex = "^[a-zA-Z0-9_!#$%&][-]*[a-zA-Z0-9_]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	    
	    Pattern pattern = Pattern.compile(regex);
	     
	    if(pattern.matcher(input).matches())
	    {
	    	System.out.println(input + " is a valid email address");
	    }
	    else
	    {
	    	System.out.println(input + " is NOT a valid email address");
	    }
	    
	    
	    

	}

}
