import java.util.Scanner;
public class Lab_GameGun
{
	static int bulletCount = 96;
	static int CLIPSIZE = 16;
	static int shotCount = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		printClip();
		while(bulletCount + shotCount > 0)
		{
			System.out.print("Action: (R to reload, S to shoot)\n");
			String Action = kb.nextLine();
			if (Action.equals("R"))
			{
				reload();
			}	
			else if (Action.equals("S"))
			{
				shoot();
			}		
			else
			{
				System.out.println("Please try again...");
			}
			System.out.println("\n");
			printClip();
		}
		System.out.println("Out of bullets!!!");
	}
	
	public static void shoot()
	{
		if(shotCount > 0)
		{
			shotCount--;
			System.out.println("Boom!!!");
		}
		else
		{
			System.out.println("Reload!!!");
		}
	}
	
	public static void reload()
	{
		int shotCount1 = shotCount;
		shotCount = Math.min(shotCount + bulletCount, CLIPSIZE);
		bulletCount -= shotCount - shotCount1;
	}
	
	public static void printClip()
	{
		String output = "Bullets: \t" + bulletCount + "\nClip: \t";
		for(int i = 0; i < CLIPSIZE; i++) 
		{
			if(i < shotCount)
			{
				output += " * ";
			}
			else
			{
				output += " [] ";
			}
		}
		System.out.println(output);
	}
}