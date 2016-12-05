import java.util.Scanner;
public class Lesson_09
{
	public static void main(String[]args)
	{
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++)
		{
			number[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int num : number)
		{
			System.out.println(num);
		}
		System.out.println();
		System.out.println("The sum of the above numbers is " + sumArray(number));
	}	
	
	public static int sumArray(int[] n)
	{
		int sum = 0;
		for(int num : n)
		{
			sum += num;
		}
		return sum;
	}
}