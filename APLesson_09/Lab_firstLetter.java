import java.util.Scanner;
public class Lab_firstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words");
		String[] word = new String[5];
		
		for(int i = 0; i < word.length; i++)
		{
			word[i] = kb.next();
		}
		first(word);
	}
	
	public static void first(String[] words)
	{
		for(String first : words)
		{
			System.out.println(first.charAt(0));
		}
	}
}	