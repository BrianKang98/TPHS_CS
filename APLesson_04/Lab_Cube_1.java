import java.util.Scanner;
public class Lab_Cube_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the side length?");
		int s = kb.nextInt();
		print(calcSurf(s));
	}
	public static int calcSurf(int s)
	{
		return 6*s*s;
	}
	
	public static void print(int sa)
	{
		System.out.println("Your surface area is " + sa + " feet.");
	}
}