import java.util.Scanner;

public class Lab_03_InflationRate
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Okay. Imagine that you had your own country for a few years.");
		System.out.println("However, you are also an economist and you will calculate the inflation rate.");
		System.out.println("What is the CPI this year?");
		int thisyr= keyboard.nextInt();
		System.out.println("What was the CPI last year?");
		int lastyr= keyboard.nextInt();
		float inf= ((thisyr-lastyr)/lastyr*100);
		System.out.println("Your country's inflation rate is "+inf+"%. It's very likely that your country is going down.");
	}	
}	