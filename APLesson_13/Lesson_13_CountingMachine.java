import java.util.ArrayList;

public class Lesson_13_CountingMachine	//Lesson_13
{
	public static void main(String[]args)
	{
		ArrayList<Lesson_13_Money> inventory = new ArrayList<Lesson_13_Money>();
		inventory.add(new Lesson_13_Coin("Penny", 2.5, 00.01));
		inventory.add(new Lesson_13_Coin("Nickel", 5.0, 00.05));
		inventory.add(new Lesson_13_Coin("Dime", 2.268, 00.10));
		inventory.add(new Lesson_13_Coin("Quarter", 5.670, 00.25));
		inventory.add(new Lesson_13_Bill("One", "Washington", 01.00));
		inventory.add(new Lesson_13_Bill("Five", "Lincoln", 05.00));
		inventory.add(new Lesson_13_Bill("Ten", "Hamilton", 10.00));
		inventory.add(new Lesson_13_Bill("Twenty", "Jackson", 20.00));
		inventory.add(new Lesson_13_Bill("Hundred", "Franklin", 100.00));
		
		for(Lesson_13_Money x : inventory)
		{
			System.out.println(x);
		}
	}
	
}