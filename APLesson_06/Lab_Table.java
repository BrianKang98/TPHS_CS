import java.util.Scanner;
public class Lab_Table
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int integer = kb.nextInt(); 
		System.out.println("What should the size of the table be?");
		int size = kb.nextInt(); 
		System.out.println("_________________");
		System.out.println(" |Equation: y = " + integer + "x|");
		System.out.println("_________________");
		
		for (int i = 1; i < (1 + size); i++) 
		{
			int y = integer * i;
			format(i, y);
		}
		System.out.println("_________________");
	}
	
	public static void format(int x, int y) 
	{
		System.out.printf("|%3d |\t%5d\t|\n", x, y);
	}
}