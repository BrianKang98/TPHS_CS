import java.util.Random;
public class Lab_01
{
	public static void main (String[]args)
	{
		Random rand = new Random();
		int myn = rand.nextInt(6)+1;
		int itsn = rand.nextInt(6)+1;
		System.out.println("You rolled a "+ myn + "\nComputer rolled a "+ itsn);
		
		String winner = rollDice(myn, itsn);
		System.out.println("Winner is "+ winner);
	}
	
	public static String rollDice(int myn, int itsn)
	{
		String winner = "";
		if (myn > itsn)
			winner = "you";
		if (myn == itsn)
			winner = "nobody";
		if (myn < itsn)
			winner = "computer";
		return winner;
	}
}