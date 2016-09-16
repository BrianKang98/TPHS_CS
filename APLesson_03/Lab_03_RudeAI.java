import java.util.Scanner;

public class Lab_03_RudeAI
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, I am the RudeAI\nWhat is your name?");
		String name= keyboard.next();
		System.out.println("What? " + name+ " is your name? That's LAME...");
		
		System.out.println("How old are you?");
		int age= keyboard.nextInt();
		System.out.println("Hmmmm... "+age+" ... you're old.");
		
		System.out.println("What do you do for fun?");
		String fun= keyboard.next();
		System.out.println(fun+"? Get a life.");
		
		System.out.println("What kind of music do you like?");
		String music= keyboard.next();
		System.out.println(music+"? Okay, once again, GET A LIFE.");
		
		System.out.println("How many siblings do you have?");
		int siblings= keyboard.nextInt();
		System.out.println("You have "+ siblings +" siblings? I bet you're the youngest.");
		
		System.out.println("What do you want to be when you grow up?");
		String future= keyboard.next();
		System.out.println(future+"? I would rather go die. Welp, good luck becoming a "+future+". I bet that your life will fail.");
	}
}