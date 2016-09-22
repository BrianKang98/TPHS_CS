import java.util.Scanner;

public class Lab_IDCard
{
	public static void main (String [] args)
	{
		Lab_IDCard idcard = new Lab_IDCard();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstname = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String lastname = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter your school site:");
		String site = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("***************************************");
		idcard.format(site, year);
		idcard.format(firstname, lastname);
		idcard.format(title, subject);
		System.out.println("***************************************");
	}
	
	public void format(String item1, String item2)
	{
		System.out.printf("*%15s      %15s *\n", item1, item2);
	}
}