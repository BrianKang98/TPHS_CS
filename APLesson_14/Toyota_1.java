import java.util.Arrays;
import java.util.ArrayList;
public class Toyota_1 extends Car
{
	public Toyota_1(String position)
	{
		super();
		ArrayList<String> toyota = new ArrayList<>(Arrays.asList(position.split(", ")));
		Double positionnx = Double.parseDouble(toyota.get(0));
		Double positionny = Double.parseDouble(toyota.get(1));
		super.move(positionnx, positionny);
	}
}