import java.util.Scanner;
public class Lab_Password
{
	public static void main(String[]args)
	{
		passCheck();
	}
	
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the USERNAME?");
		String entUsername = kb.nextLine();
		System.out.println("What is the PASSWORD?");
		String entPassword = kb.nextLine();
		if (entUsername.equals("USERNAME"))
		{
			if (entPassword.equals("PASSWORD"))
				System.out.println("Both your username and password are correct. You are granted access! Try again?");
		
			else
				System.out.println("Your username is correct, but your password is incorrect. Try again.");
				passCheck();
		}
		else
		{
			if (entPassword.equals("PASSWORD"))
			{
				System.out.println("Your password is correct, but your username is incorrect. Try again.");
				passCheck();
			}
			else
			{
				System.out.println("Both your username and password are incorrect. Try again.");
				passCheck();
			}
		}
	}
	
}