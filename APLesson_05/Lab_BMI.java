import java.util.Scanner;
public class Lab_BMI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in m?");
		double h = kb.nextDouble();
		
		System.out.println("What is your weight in kg?");
		double w = kb.nextDouble();
		
		double BMI = w/(h*h);
		String cond = Condition(BMI);
		
		System.out.println("Your BMI is " + BMI + " , your condition is " + cond + " !");
	}
	public static String Condition(double BMI)
	{
		if (BMI >= 39.9)
			return "morbidly obese";
		if (BMI >= 35)
			return "very Obese";
		if (BMI >= 29.9)
			return "obese";
		if (BMI >= 25)
			return "overweight";
		if (BMI >= 18.5)
			return "normal";
		else
			return "underweight";
	}
}