import java.util.Scanner;
public class Lab_Rectangle_1
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length?");
		int l = kb.nextInt();
		System.out.println("What is the width?");
		int w = kb.nextInt();
		print(calcPerim(l,w));
	}
	
	public static int calcPerim(int l, int w)
	{
		return 2*l+2*w;
	}
	
	public static void print(int perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " feet around.");
	}
}