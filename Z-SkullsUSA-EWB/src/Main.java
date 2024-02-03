import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

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
		
		for(int i=0;i<lines/5;i++)
			System.out.println("Candidate "+(i+1)+":"+" "+Matha.jobC(lines/5, i, Matha.avg(scanner.setD(dataSet,lines/5),lines/5)));
	}
}