import java.util.ArrayList;
import java.util.Arrays;

public class Toyota extends Car
{
	private double[] locate;
	private double x;
	private double y;
	
	public Toyota(String z)
	{
		String[] locate = z.split(", ");
		x = Double.parseDouble(locate[0]);
		y = Double.parseDouble(locate[1]);
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