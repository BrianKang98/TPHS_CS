import java.util.Arrays;
public class Car implements Location
{
	private final int ID;
	private double[] location = new double[2];
	
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 100000;
	}
	
	public void move(double nx, double ny)
	{
		location[0] += nx;
		location[1] += ny;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}