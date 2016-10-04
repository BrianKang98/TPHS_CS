import java.util.Scanner;
public class Lab_Circle_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius?");
		double r = kb.nextInt();
		print(calcArea(r));
	}
	public static double calcArea(double r)
	{
		return r*r*3.1415926535;
	}
	
	public static void print(double a)
	{
		System.out.println("Your area is " + a + " feet.");
	}
}