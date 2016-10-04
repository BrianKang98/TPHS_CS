import java.util.Scanner;
public class Lab_Average_1 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the first number?");
		double b = kb.nextDouble();
		System.out.println("What is the next number?");
		double c = kb.nextDouble();
		System.out.println("What is the last number?");
		double d = kb.nextDouble();
		print(calcAvg(b,c,d));
	}
	public static double calcAvg(double b, double c, double d)
	{
		return (b+c+d)/3;
	}
	
	public static void print(double average)
	{
		System.out.println("Your average is " + average + " .");
	}
}