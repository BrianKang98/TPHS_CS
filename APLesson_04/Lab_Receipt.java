import java.util.Scanner;

public class Lab_Receipt
{
	public static void main(String [] args)
	{
		Lab_Receipt receipt = new Lab_Receipt();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2: ");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3: ");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		
		String subtotal = price1+price2+price3;
		
		String tax = 0.08*(subtotal);
		
		String total = subtotal+tax
		
		System.out.println("<<<<<<<<<<__Receipt__>>>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		
		System.out.println("\n__________________________________________"+"\n* Thank you for your support *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*  %15s . . . . . .      %5.2f", item, price);
	}
}