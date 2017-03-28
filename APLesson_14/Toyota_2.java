import java.util.ArrayList;
import java.util.Arrays;

public class Toyota_2 extends Car_2
{
	private double[] Location_2;
	private double x;
	private double y;
	
	public Toyota_2(double[] z)
	{
		Location_2 = z;
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
		return Location_2;
	}
}