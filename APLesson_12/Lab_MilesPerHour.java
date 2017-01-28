import static java.lang.Math.*;
public class Lab_MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public Lab_MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public Lab_MilesPerHour(int dist, int hrs, int min)
	{
		distance = dist;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setdist(int dist)
	{
		distance = dist;
	}
	
	public void sethrs(int hrs)
	{
		hours = hrs;
	}
	public void setmin(int min)
	{
		minutes = min;
	}
	
	public void setmph()
	{
		mph = 0;
	}
	
	public int getdist()
	{
		return distance;
	}
	
	public int gethrs()
	{
		return hours;
	}
	
	public int getmin()
	{
		return minutes;
	}
	
	public double calcmph()
	{
		mph = Math.round(distance / (hours + minutes / 60));
		return mph;
	}
}