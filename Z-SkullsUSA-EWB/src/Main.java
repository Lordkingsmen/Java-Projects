import java.io.IOException;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		int lines = scanner.lineC();
		double[][] dataSet = new double[lines][5];
		dataSet = scanner.read(dataSet,lines);
		
		System.out.println(Arrays.deepToString(dataSet));
		
		System.out.println(Arrays.deepToString(scanner.setD(dataSet,lines/5)));
		
		System.out.println(Arrays.toString(Matha.avg(scanner.setD(dataSet,lines/5),lines/5)));
	}
}