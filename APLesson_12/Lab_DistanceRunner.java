import java.util.Scanner;
public class Lab_DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter first x: ");
		int xOne = kb.nextInt();
		System.out.println("Please enter first y: ");
		int yOne = kb.nextInt();
		System.out.println("Please enter second x: ");
		int xTwo = kb.nextInt();
		System.out.println("Please enter second y: ");
		int yTwo = kb.nextInt();
		
		Lab_Distance object1 = new Lab_Distance(xOne, yOne, xTwo, yTwo);
		
		object1.setxOne(xOne);
		object1.setyOne(yOne);
		object1.setxTwo(xTwo);
		object1.setyTwo(yTwo);
		
		System.out.println("The distance between (" + object1.getxOne() + ", " + object1.getyOne() + ") and (" + object1.getxTwo() + "," + object1.getyTwo() + ") is " + object1.calcDist());
	}
}