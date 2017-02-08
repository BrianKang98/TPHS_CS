public class Lesson_13_Coin extends Lesson_13_Money	//Lesson_13
{
	private double weight;
	
	public Lesson_13_Coin()
	{
		super();
		this.weight = 0;
	}
	
	public Lesson_13_Coin(String n, double w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "g\n" +
				super.toString();
	}
}