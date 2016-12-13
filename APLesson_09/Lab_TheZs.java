import java.util.Scanner;
public class Lab_TheZs
{
	public static void main(String[]args)
	{
		String[] words = new String [5];
		fillArray(words);
		System.out.println("For the words... ");
		printArray(words);
		System.out.println();
		System.out.println("Only " + hasZs(words)+ "contain(s) the letter z.");
	}
	
	public static void fillArray(String[] word)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words");
		for (int i = 0; i < word.length; i++)
		{
			word[i] = kb.nextLine();
		}
	}
	
	public static void printArray(String[] word)
	{
		for (String print : word)
		{
			System.out.print(print + " ");
		}
	}
	
	public static String hasZs(String[] word)
	{
		String zs = "";
		for(String w : word)
		{
			if(w.indexOf("z") >= 0)
			{
				zs += w + " ";
			}
		}
		return zs;
	}
}	