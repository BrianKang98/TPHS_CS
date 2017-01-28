import static java.lang.Math.*;
public class Lab_Inventory
{
	private String Manufacturer, Name, Category;
	private long UPC;
	private double Price;
	
	public Lab_Inventory(String manufact, String name)
	{
		Manufacturer = manufact;
		Name = name;
		UPC = (long)(Math.random() * 1000000000);
		Category = "None";
	}
	
	public Lab_Inventory(String manufact, String name, String category, double price)
	{
		Manufacturer = manufact;
		Name = name;
		UPC = (long)(Math.random() * 1000000000);
		Category = category;
		Price = price;
	}
	
	public void set(String manufact, String name, String category, double price)
	{
		Manufacturer = manufact;
		Name = name;
		Category = category;
		Price = price;
	}
	
	public String getmanufacturer()
	{
		return Manufacturer;
	}
	
	public String getname()
	{
		return Name;
		
	}
	
	public long getUPC()
	{
		return UPC;
	}
	
	public String getcateg()
	{
		return Category;
	}
	
	public double getprice()
	{
		return Price;
	}
	
	public String toString()
	{
		return "Customer Info...\nManufacturer: " + Manufacturer +
							"\nName: " + Name +
							"\nUPC Code: " + UPC +
							"\nCategory: " + Category +
							"\nPrice: " + Price;
	}
}