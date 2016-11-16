public class Lab_Song
{
	public static void main(String[]args)
	{
		sing("Na ", 4);
		sing("Na ", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int number)
	{
		for (int i = 1; i <= number; i++) 
		{
			System.out.printf(word + " ", word);
		}
		System.out.println();
	}
}