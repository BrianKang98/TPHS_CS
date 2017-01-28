import static java.lang.Math.*;
public class Lab_User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public Lab_User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public Lab_User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setfla(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av; //lol	//dont google
	}

	public String getfN()
	{
		return firstName;
	}
	
	public String getlN()
	{
		return lastName;
	}
	
	public String getav()
	{
		return avatar;
	}
	
	public int getuID()
	{
		return userID;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
}