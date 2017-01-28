import static java.lang.Math.*;
public class Lab_Car
{
	private String paint, interior, engine, tires;
	
	public Lab_Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Lab_Car(String color, String inter, String engin, String tired)
	{
		paint = color;
		interior = inter;
		engine = engin;
		tires = tired;
	}
	
	public void setcol(String color)
	{
		paint = color;
	}
	
	public void setinter(String inter)
	{
		interior = inter;
	}
	
	public void seteng(String engin)
	{
		engine = engin;
	}
	
	public void settired(String tired)
	{
		tires = tired;
	}
	
	public String getcolor()
	{
		return paint;
	}
	
	public String getinter()
	{
		return interior;
	}
	
	public String getengin()
	{
		return engine;
	}
	
	public String gettired()
	{
		return tires;
	}
}