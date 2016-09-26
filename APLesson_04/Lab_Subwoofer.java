import java.util.Scanner;

public class Lab_Subwoofer
{
	public static void main (String [] args)
	{
		Lab_Subwoofer volume = new Lab_Subwoofer();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the height in inches?");
		double h = kb.nextDouble();
		
		System.out.println("What is the length in inches?");
		double l = kb.nextDouble();
		
		System.out.println("What is the width in inches?");
		double w = kb.nextDouble();
		
		double vol = volume.calcVol(h,l,w);
		System.out.println("The volume in cubit feet is " + vol/1728);
	}
	
	public double calcVol(double h, double l, double w)
	{
		return (h*l*w);
	}
}	