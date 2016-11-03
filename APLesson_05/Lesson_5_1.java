import java.util.Scanner;
public class Lesson_5_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word");
		String word1 = kb.next();
		String word2 = "word";
		System.out.println(word1.equals(word2));
	}
}