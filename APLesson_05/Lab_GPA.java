import java.util.Scanner;
public class Lab_GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter math letter grade");
		String g1 = kb.next();
		double mathGP = calcPoints(g1);
		
		System.out.println("Enter science letter grade");
		String g2 = kb.next();
		double scienceGP = calcPoints(g2);
		
		System.out.println("Enter history letter grade");
		String g3 = kb.next();
		double historyGP = calcPoints(g3);
		
		System.out.println("Enter english letter grade");
		String g4 = kb.next();
		double englishGP = calcPoints(g4);
		
		System.out.println("Enter language letter grade");
		String g5 = kb.next();
		double languageGP = calcPoints(g5);
		
		System.out.println("Enter art letter grade");
		String g6 = kb.next();
		double artGP = calcPoints(g6);
		
		System.out.println("Enter social science letter grade");
		String g7 = kb.next();
		double socialscienceGP = calcPoints(g7);
		
		double GPA = (mathGP + scienceGP + historyGP + englishGP + languageGP + artGP + socialscienceGP)/7;
		System.out.println("Your GPA is "+ GPA + " !");
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4;
		if (grade.equals("B"))
			return 3;
		if (grade.equals("C"))
			return 2;
		if (grade.equals("D"))
			return 1;
		else
			return 0;
	}
}