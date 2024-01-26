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
		
		System.out.println(Arrays.deepToString(setData(dataSet,lines/5)));
		
		System.out.println(Arrays.toString(avgData(setData(dataSet,lines/5),lines/5)));
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
	      	BufferedReader reader = new BufferedReader(new FileReader("src/Data.txt"));
				while (reader.readLine() != null) lines++;
			reader.close();
			while(!(lines%5==0))
				lines++;
			return lines;
	}
	
	public static double[][] readData(double[][] dataSet, int lines) throws IOException
	{//This uses the now prepared array to actually input the data from the set.
		Scanner fileScan = new Scanner(new File("src/Data.txt"));
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
	
	public static double[][] setData(double[][] dataSet, int a)
	{
		double bPScale=0,persTrait=0,creTrait=0,deTrait=0,teamTrait=0;
		
		double[][] avgScore = new double[a][5];
		
		for(int k=0;k<a;k++)
			for(int j=0;j<5;j++)
			{
				for(int i=0;i<a;i++)
					switch(i)
					{
						case 0:bPScale=diff(dataSet[j+(k*5)][i]);
						case 1:persTrait=diff(dataSet[j+(k*5)][i]);
						case 2:creTrait=diff(dataSet[j+(k*5)][i]);
						case 3:deTrait=diff(dataSet[j+(k*5)][i]);
						case 4:teamTrait=diff(dataSet[j+(k*5)][i]);
					}
				avgScore[k][j]=rnd.hun(dSet(persTrait,creTrait,deTrait,teamTrait));
			}
		return avgScore;
	}
	
	public static double[] avgData(double[][] avgScore, int a)
	{//This gets the average score of the participant.
		double[] avgTotal=new double[a];
		for(int i=0;i<a;i++)
			avgTotal[i]=rnd.hun(arr.addS(avgScore[i],5)/5);
		return avgTotal;
	}
}