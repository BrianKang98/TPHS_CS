import java.util.ArrayList;
import java.util.Arrays;

public class Toyota implements Location
{
	private double x;
	private double y;
	private double[] locate;

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