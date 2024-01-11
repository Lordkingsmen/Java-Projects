import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		double[] dataSet = new double[lineCounter()];
		double bPScale;
		double persTrait = 7;
		double creTrait = 6;
		double deTrait = 6;
		double teamTrait = 1;
		
		persTrait=diff(persTrait);
		creTrait=diff(creTrait);
		deTrait=diff(deTrait);
		teamTrait=diff(teamTrait);
		
		readNames(dataSet);
		
		System.out.println(dSet(persTrait,creTrait,deTrait,teamTrait));
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
	
	public static double[] readNames(double[] dataSet) throws IOException
	{//This uses the now prepared array to actually input the data from the set.
		Scanner fileScan = new Scanner(new File("src\\Data.txt"));
		int counter = 0;
		
		while (fileScan.hasNextLine())
		{
			counter++;
			dataSet[counter-1]=fileScan.nextInt();
        }
		fileScan.close();
		return dataSet;
	}
}