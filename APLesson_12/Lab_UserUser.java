import java.util.Scanner;
public class Lab_UserUser
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String fN = kb.nextLine();
		
		System.out.println("What is your last name?");
		String lN = kb.nextLine();
		
		System.out.println("Would you like a public avatar? (y or n)");
		String a = kb.nextLine();
		
		if(a.equals("n"))
		{
			Lab_User object1 = new Lab_User(fN, lN);
			System.out.print(object1);
		}
			
		if(a.equals("y"))
		{
			System.out.println("Enter your avatar name: ");
			String av = kb.nextLine();
			Lab_User object2 = new Lab_User(fN, lN, av);
			System.out.print(object2);
		}
	}
}