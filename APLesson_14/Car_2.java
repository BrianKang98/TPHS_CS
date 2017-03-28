import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car_2 implements Location_2
{
	double[] Location_2;
	
	public Car_2()
	{
		Location_2 = new double[2];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public abstract void move(double nx, double ny);
	
	public abstract double[] getLoc();
}