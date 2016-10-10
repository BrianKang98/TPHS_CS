import java.util.Scanner;
public class Quiz_04_SG
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the side length?");
		int side = kb.nextInt();
		surfPrint(side);
	}
	public static double calcSurf(int side)
	{
		return 6*(Math.pow(side,2));
	}
	
	public static void surfPrint(int side)
	{
		System.out.printf("The surface area of your cube is %.5f inches.", calcSurf(side));
	}
}