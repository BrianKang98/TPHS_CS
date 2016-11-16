import java.util.Scanner;
public class Lab_ByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the number to count to?");
		int tonum = kb.nextInt();
		System.out.println("What is the number to count by?");
		int bynum = kb.nextInt();
		
		for (int i = 1; i <= (tonum/bynum); i++)
		{
			System.out.println((bynum * i) + " ");
		}
		System.out.println();
	}
}