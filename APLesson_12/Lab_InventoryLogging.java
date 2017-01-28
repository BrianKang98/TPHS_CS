import java.util.Scanner;
public class Lab_InventoryLogging
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Who is the item manufacturer?");
		String manufact = kb.nextLine();
		System.out.println("What is the product's name?");
		String name = kb.nextLine();
	
		System.out.println("Would you like to enter the category and price? (y or n)");
		String a = kb.nextLine();
	
		if(a.equals("n"))
		{
			Lab_Inventory object1 = new Lab_Inventory(manufact, name);
			System.out.println(object1);
		}
		
		if(a.equals("y"))
		{
			System.out.println("What section in the store can this be found?");
			String category = kb.nextLine();
			System.out.println("How much is the item?");
			double price = kb.nextDouble();
		
			Lab_Inventory object2 = new Lab_Inventory(manufact, name, category, price);
			System.out.println(object2);
		}
	}
}