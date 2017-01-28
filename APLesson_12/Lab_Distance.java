import static java.lang.Math.*;
public class Lab_Distance
{
	private int x1, y1, x2, y2;
	private double distance;
	
	public Lab_Distance()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		distance = 0;
	}
	
	public Lab_Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
		distance = 0;
	}
	
	public void setxOne(int xOne)
	{
		x1 = xOne;
	}
	
	public void setyOne(int yOne)
	{
		y1 = yOne;
	}
	public void setxTwo(int xTwo)
	{
		x2 = xTwo;
	}
	
	public void setyTwo(int yTwo)
	{
		y2 = yTwo;
	}
	
	public void setdistance()
	{
		distance = 0;
	}
	
	public int getxOne()
	{
		return x1;
	}
	
	public int getyOne()
	{
		return y1;
	}
	
	public int getxTwo()
	{
		return x2;
	}
	
	public int getyTwo()
	{
		return y2;
	}
	
	public double calcDist()
	{
		distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return distance;
	}
}