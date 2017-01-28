import java.util.Scanner;
public class Lab_CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the paint color: ");
		String color = kb.nextLine();
		System.out.println("What is the interior: ");
		String inter = kb.nextLine();
		System.out.println("What is the engine: ");
		String engin = kb.nextLine();
		System.out.println("What kind of tires: ");
		String tired = kb.nextLine();
		
		Lab_Car object1 = new Lab_Car(color, inter, engin, tired);
		
		System.out.println("Your vehicle is ready...... \n\tPaint: " + object1.getcolor() + "\n\tInterior: " + object1.getinter() + "\n\tEngine: " + object1.getengin() + "\n\tTires: " + object1.gettired());
	}
}