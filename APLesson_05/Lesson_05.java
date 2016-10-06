import java.util.Random;
public class Lesson_05
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int num = rand.nextInt(4)+1;
		System.out.println(num);
	}
}