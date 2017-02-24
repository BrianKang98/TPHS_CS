public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket t1 = new Walkup();
		Ticket t2 = new Advance(90);
		Advance Student = new StudentAdvance(10);
		
		System.out.println("Walkup\n" + t1);
		System.out.println("\nAdvance\n" + t2);
		System.out.println("\nStudent advance\n" + Student);
	}
}