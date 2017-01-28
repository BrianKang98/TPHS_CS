import java.util.Scanner;
public class Lab_MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter distance: ");
		int dist = kb.nextInt();
		System.out.println("Enter hours: ");
		int hrs = kb.nextInt();
		System.out.println("Enter minutes: ");
		int min = kb.nextInt();
	
		Lab_MilesPerHour object1 = new Lab_MilesPerHour(dist, hrs, min);
		
		object1.setdist(dist);
		object1.setmin(min);
		object1.sethrs(hrs);
	
		System.out.println(object1.getdist() + " miles in " + object1.gethrs() + " hours " + object1.getmin() +" minutes = " + object1.calcmph() + "mph");
	}	
}