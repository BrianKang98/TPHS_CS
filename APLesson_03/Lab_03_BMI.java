import java.util.Scanner;

public class Lab_03_BMI
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		int h= keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
		int w= keyboard.nextInt();
		
		float bmi= (703*w/h/h);
		
		System.out.println("Your BMI is "+ bmi+".");
	}
}