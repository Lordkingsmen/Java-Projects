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
		
		System.out.println(Arrays.deepToString(dataSet));
		
		System.out.println(Arrays.toString(setData(dataSet,lines)));
		
		System.out.println(Arrays.toString(avgData(setData(dataSet,lines),lines)));
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
			while(!(lines%5==0))
				lines++;
			return lines;
	}
	
	public static double[][] readData(double[][] dataSet, int lines) throws IOException
	{//This uses the now prepared array to actually input the data from the set.
		Scanner fileScan = new Scanner(new File("src\\Data.txt"));
		while (fileScan.hasNextInt())
			for(int i=0;i<lines;i++)
				for(int j=0;j<5;j++)
					if(!(fileScan.hasNextInt()))
						dataSet[i][j]=0;
					else
						dataSet[i][j]=fileScan.nextInt();
		fileScan.close();
		return dataSet;
	}
	
	public static double[] setData(double[][] dataSet, int lines)
	{
		double bPScale=0,persTrait=0,creTrait=0,deTrait=0,teamTrait=0;
		
		double[] avgScore = new double[lines];
		
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<5;j++)
				switch(j)
				{
					case 0:bPScale=dataSet[i][j];
					case 1:persTrait=dataSet[i][j];
					case 2:creTrait=dataSet[i][j];
					case 3:deTrait=dataSet[i][j];
					case 4:teamTrait=dataSet[i][j];
				}
			avgScore[i]=(dSet(diff(persTrait),diff(creTrait),diff(deTrait),diff(teamTrait)));
			avgScore[i]=rnd.hun(avgScore[i]);
		}
		
		return avgScore;
	}
	
	public static double[] avgData(double[] avgScore, int lines)
	{//This gets the average score of the participant.
		double[] avgTotal=new double[lines/5];
		
		for(int i=0,j=0;i<lines;j++)
		{
			double a=0;
			for(int k=0;k<5;k++,i++)
				a=a+avgScore[i];
			avgTotal[j]=rnd.hun(a/5);
		}
		return avgTotal;
	}
}