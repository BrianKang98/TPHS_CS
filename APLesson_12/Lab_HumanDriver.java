import java.util.Scanner;
public class Lab_HumanDriver
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What color is my hair?");
		String HAIR = kb.nextLine();
		System.out.println("What color are my eyes?");
		String EYES = kb.nextLine();
		System.out.println("What color is my skin?");
		String SKIN = kb.nextLine();
	
		Lab_Human object1 = new Lab_Human(HAIR, EYES, SKIN);
		
		System.out.println("My info... \n\tHair: " + object1.getHAIR() + "\n\tEye Color : " + object1.getEYES() + " \n\tSkin: " + object1.getSKIN());
		
		System.out.println("What color is friend's hair?");
		HAIR = kb.nextLine();
		System.out.println("What color are friend's eyes?");
		EYES = kb.nextLine();
		System.out.println("What color is friend's skin?");
		SKIN = kb.nextLine();
		
		object1.setHES(HAIR, EYES, SKIN);
	
		System.out.println("Friend's info... \n\tHair: " + object1.getHAIR() + "\n\tEye Color : " + object1.getEYES() + " \n\tSkin: " + object1.getSKIN());
	}
}