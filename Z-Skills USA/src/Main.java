import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		int lines = lineCounter();
		double[][] dataSet = new double[lines][5];
		dataSet = readData(dataSet,lines);
		
		double bPScale;
		double persTrait;
		double creTrait;
		double deTrait;
		double teamTrait;
		
		for()
		{
			
		}
		System.out.println(dSet(diff(persTrait),diff(creTrait),diff(deTrait),diff(teamTrait)));
		
		System.out.println(Arrays.deepToString(dataSet));
	}
	
	public static double diff(double a)
	{//gets the difference of the number from 5.
		return (a-5);
	}
	
	public static double dSet(double persTrait, double creTrait, double deTrait, double teamTrait)
	{//does the actual problem and returns the answer.
		return (Math.sqrt(Math.abs(2*persTrait+(creTrait>0?(creTrait)*(creTrait):-(creTrait)*(creTrait))+2*deTrait+(3*teamTrait-creTrait))));
	}
	
	public static int lineCounter() throws IOException
	{//Any file matching the name can be counted and prepared for the program.
	      	int lines = 0;
	      	BufferedReader reader = new BufferedReader(new FileReader("src\\Data.txt"));
				while (reader.readLine() != null) lines++;
			reader.close();
			return lines;
	}
	
	public static double[][] readData(double[][] dataSet, int lines) throws IOException
	{//This uses the now prepared array to actually input the data from the set.
		Scanner fileScan = new Scanner(new File("src\\Data.txt"));
		while (fileScan.hasNextLine())
			for(int i=0;i<lines;i++)
				for(int j=0;j<5;j++)
					dataSet[i][j]=fileScan.nextInt();
		fileScan.close();
		return dataSet;
	}
	
	public static void setData()
	{
		
	}
}