public class Lesson_13_Bill extends Lesson_13_Money	//Lesson_13
{
	private String face;
	
	public Lesson_13_Bill()
	{
		super();
		face = "";
	}
	
	public Lesson_13_Bill(String n, String f, double v)
	{
		super(n, v);
		face = f;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n" + 
				super.toString();
	}
}