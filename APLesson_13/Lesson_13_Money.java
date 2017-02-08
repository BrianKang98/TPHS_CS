public class Lesson_13_Money 	//Lesson_13
{
	private String name;
	private double value;
	
	public Lesson_13_Money()
	{
		this.name = "";
		this.value = 0;
	}
	
	public Lesson_13_Money(String n, double v)
	{
		this.name = n;
		this.value = v;
	}
	
	public String toString()
	{
		return "Your " + name + " is worth $" + value + ".\n";
	}
}