import java.util.ArrayList;
import java.util.Arrays;

public class GMC_2 extends Car_2
{
	private double x;
	private double y;
	
	public GMC_2(double nx, double ny)
	{
		x = nx;
		y= ny;
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
		double[] locate = {x,y};
		return locate;
	}
}