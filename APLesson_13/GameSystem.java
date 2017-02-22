import java.util.Random;

public class GameSystem
{
	String platform;
	int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = (int)(Math.random() * 1000000 +1);
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random() * 1000000 +1);
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}