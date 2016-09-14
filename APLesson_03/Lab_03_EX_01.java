import java.util.Scanner;

public class RudeAI
{
	public class void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, I am the RudeAI\nWhat is your name?");
		String name= keyboard.next();
		System.out.println("What? " + name+ " is your name? That's LAME...");
		
		System.out.println("How old are you?");
		int age= keyboard.nextInt();
		
	}
}