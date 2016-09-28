import java.util.Scanner;
public class Lab_Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		l = kb.nextDouble();
		System.out.println("What is the width of the rectangle?");
		w = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = l+l+w+w;
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}