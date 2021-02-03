package emailProj;
import java.util.Scanner;
public class emailSearch {
	public static void searchID(String[] emails, String target)
	{
		boolean found = false;
		int temp = 0;
		while(!found && temp < emails.length)
		{
			if(target.equals(emails[temp]))
			{
				System.out.println("The Email: " + emails[temp] + " was found in our system");
				found = true;
			}
			temp++;
		}
		if(!found)
		{
			System.out.println("The Email: " + target + " could not be found");
		}
		
	}

	public static void main(String[] args) 
	{
		String[] emails = {"email@email.com", "email@test.com", "test@email.com", "test@test.com", 
				"personA@email.com", "personB@email.com", "persona@email.com"};
		
		@SuppressWarnings("resource")
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("What Email are you looking for?");
	    
	    String target = myScan.next();
	    
	    searchID(emails, target);
	}

}
