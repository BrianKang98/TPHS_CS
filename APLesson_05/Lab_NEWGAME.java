import java.util.Scanner;
public class Lab_NEWGAME
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are selected as the hero. You will have to go on a fairly safe but also dangerous adventure. \nWould you like to go on a journey? \nYES or NO???");
		String ans1 = kb.nextLine();
		
		if (ans1.equals("YES"))
		{
			System.out.println("Let's go! You have encountered a slime. \nWhat would you like to do? \nFISTFIGHT or RUN???");
			String ans2 = kb.nextLine();
			if (ans2.equals("RUN"))
			{
				System.out.println("You have safely entered a new village. You encountered a blacksmith. \nWhat would you like to do? \nBUY or FIGHT???");
				String ans3 = kb.nextLine();
				if (ans3.equals("BUY"))
				{
					System.out.println("You have bought a free wood sword. You have left the village to continue your journey. You have encountered a black dragon. \nWhat would you like to do? \nFIGHT or RUN???");
					String ans4 = kb.nextLine();
					if (ans4.equals("FIGHT"))
					{
						System.out.println("You have defeated the black dragon! You have obtained a GOLDENKEYTHATOPENSTHEDEMONKING'sROOM'sSECRETDOOR'sLOCK. \nYou somehow entered the Demon King's castle and defeated him easily using your stick. You are in front of the Secret Door. \nWhat would you like to do? \nUNLOCK or KEEPLOCK???");
						String ans5 = kb.nextLine();
						if (ans5.equals("KEEPLOCK"))
						{
							System.out.println("You decided to keep the door locked and keep the hidden secrets as part of unknown history. \nYou returned peacefully to your bed because life outside your bed is dangerous. \nWhat would you like to do? \nSLEEP or TRAVEL???");
							String ans6 = kb.nextLine();
							if (ans6.equals("SLEEP"))
							{
								System.out.println("Good night hero. Your journey has ended here. You are no longer needed. \nWASTED The NPC has beat you up in your sleep...");
							}
							else
								System.out.println("WASTED The DEMON GOD was waiting outside of you room...");
						}
						else
							System.out.println("WASTED You have awakened the DEMON GOD and somehow revived the Demon King...");
					}
					else
						System.out.println("WASTED The black dragon has burnt into scripsychips... Did you really think you could run away from a flying dragon?");
				}
				else
					System.out.println("WASTED The blacksmith beat you up using his Legendary Sword...");
			}
			else
				System.out.println("WASTED The slime has eaten you. Your body is visible through the slime's stomach...");
		}
		else
			System.out.println("WASTED You have been beat up by the NPC...");
	}
}	