import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car implements Location
{
	double[] Location;
	double x;
	double y;
	
	public Car(double[] z)
	{
		Location = z;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public void move(double nx, double ny)
	{
		x += nx;
		y += ny;
	}
	
	public double[] getLoc()
	{
		return Location;
	}
}