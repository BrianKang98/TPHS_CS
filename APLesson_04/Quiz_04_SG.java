import java.util.Scanner;
public class Quiz_04_SG
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first item.");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price of your first item.");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your second item.");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price of your second item.");
		double price2 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		System.out.println("\n__________________________________________"+"\n* Thank you for your support *");
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%15s . . . . . . . . . $%.2f", item,price);
	}
}