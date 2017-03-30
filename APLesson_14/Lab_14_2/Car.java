import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car implements Location
{
	double[] Location;
	
	public Car()
	{
		Location = new double[2];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public abstract void move(double one, double two);
	
	public abstract double[] getLoc();
}