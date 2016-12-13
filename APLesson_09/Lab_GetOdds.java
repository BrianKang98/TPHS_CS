import java.util.Scanner;
public class Lab_GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers... ");
		printArray(numbers);
		System.out.println("The " + getOdds(numbers) + " are odd numbers.");
	}
	
	public static void fillArray(int[] number)
	{
		for(int i = 0; i < number.length; i++)
		{
			number[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray(int[] number)
	{
		for(int print : number)
		{
			System.out.print(print + " ");
		}
	}
	
	public static int getOdds(int[] number)
	{
		int odds=0;
		for(int num : number)
		{
			if (num%2 == 0)
			{
				odds++;
			}		
		}
		return odds;
	}
}	