import java.util.Scanner;
public class Lab_GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers... " + printArray(numbers));
		System.out.println("The " + getOdds(numbers) + " are odd numbers.");
	}
	
	public static void fillArray(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static int printArray(int[] numbers)
	{
		for(int print : numbers)
		{
			System.out.println(print + " ");
		}
	}
	
	public static int getOdds(int[] numbers)
	{
		String odds;
		for(int num : numbers)
		{
			if (num%2 == 1)
			odds += num;
		}
		return odds;
	}
}	