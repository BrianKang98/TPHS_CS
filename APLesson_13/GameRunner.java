public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem pc = new PC("pcccccccccccc");
		GameSystem XBox = new XBox("xboxxxxxxxxxxx");
		Console playstation = new PlayStation("playstationnnnnnnnnn");
		
		System.out.println(pc);
		System.out.println(XBox);
		System.out.println(playstation);
	}
}