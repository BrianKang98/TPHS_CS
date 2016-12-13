public class Lab_BiggestNum
{
	static int Array;
	
	public static void main(String[]args)
	{
		int[] Array = new int[10];
		fillArray(Array);
		System.out.println("For the following numbers... ");
		printArray(Array);
		System.out.println("The biggest number is " + getBiggest(Array));
	}
	
	public static void fillArray(int[] number)
	{
		for (int i = 0; i < number.length; i++)
		{
			number[i] = (int)(Math.random()*10 +1);
		}
	}
	
	public static void printArray(int[] number)
	{
		for (int print : number)
		{
			System.out.print(print + " ");
		}
	}
	
	public static int getBiggest(int[] number)
	{
		int max = 0;
		for(int num : number)
		{
			if (num > max)
			{
				max = num;
			}
		}
		return max;
	}
}	