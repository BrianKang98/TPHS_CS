import java.util.Scanner;
public class Lab_02
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter item1.");
		String t1 = kb.nextLine();
		System.out.println("Please enter the price.");
		double p1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2.");
		String t2 = kb.nextLine();
		System.out.println("Please enter the price.");
		double p2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item3.");
		String t3 = kb.nextLine();
		System.out.println("Please enter the price.");
		double p3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item4.");
		String t4 = kb.nextLine();
		System.out.println("Please enter the price.");
		double p4 = kb.nextDouble();
		
		double subtotal = p1 + p2 + p3 + p4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<< Receipt >>>>>>>>");
		format(t1, p1);
		format(t2, p2);
		format(t3, p3);
		format(t4, p4);
		format("Subtotal", subtotal);
		format("Discount", calcDisc(subtotal));
		format("Tax", tax);
		format("Total", total);
		System.out.println("____________________________\n        Thank you!        ");
		
	}	
	
	public static double calcDisc(double sub)
	{
		if (sub >= 2000)
			return sub * 0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%15s . . . . . . %.2f\n", item, price);
	}
}	