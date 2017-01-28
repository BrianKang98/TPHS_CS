import static java.lang.Math.*;
public class Lab_Human
{
	private String hair, eyes, skin;
	
	public Lab_Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Lab_Human(String HAIR, String EYES, String SKIN)
	{
		hair = HAIR;
		eyes = EYES;
		skin = SKIN;
	}
	
	public void setHES(String HAIR, String EYES, String SKIN)
	{
		hair = HAIR;
		eyes = EYES;
		skin = SKIN;
	}
	
	public String getHAIR()
	{
		return hair;
	}
	
	public String getEYES()
	{
		return eyes;
	}
	
	public String getSKIN()
	{
		return skin;
	}
}