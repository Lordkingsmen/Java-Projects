import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class scanner
{
	public static double[][] read(double[][] dataSet, int lines) throws IOException
	{//This uses the now prepared array to actually input the data from the set.
		Scanner fileScan = new Scanner(new File("src/Data.txt"));
		String line = "";
		double[] number = new double[lines*5];
		while (fileScan.hasNext())
		{
			for(int i=0;i<lines;i++)line = line+fileScan.nextLine()+(i>=lines-1?"":",");
			String[] split = line.split(",");
			for(int i=0;i<lines*5;i++)number[i] = Double.valueOf(split[i]);
			for(int i=0,k=0;i<lines;i++)
				for(int j=0;j<5;j++,k++)
						dataSet[i][j]=number[k];
		}
		fileScan.close();
		return dataSet;
	}
	
	public static double[][] setD(double[][] dataSet, int a)
	{
		double bPScale=0,persTrait=0,creTrait=0,deTrait=0,teamTrait=0;
		
		double[][] avgScore = new double[a][5];
		
		for(int k=0;k<a;k++)
			for(int j=0;j<5;j++)
			{
				for(int i=0;i<a;i++)
					switch(i)
					{
						case 0:bPScale=Matha.diff(dataSet[j+(k*5)][i]);
						case 1:persTrait=Matha.diff(dataSet[j+(k*5)][i]);
						case 2:creTrait=Matha.diff(dataSet[j+(k*5)][i]);
						case 3:deTrait=Matha.diff(dataSet[j+(k*5)][i]);
						case 4:teamTrait=Matha.diff(dataSet[j+(k*5)][i]);
					}
				avgScore[k][j]=Matha.rnd(Matha.sAvg(persTrait,creTrait,deTrait,teamTrait),100);
			}
		return avgScore;
	}
	
	public static int lineC() throws IOException
	{//Any file matching the name can be counted and prepared for the program.
	      	int lines = 0;
	      	BufferedReader reader = new BufferedReader(new FileReader("src/Data.txt"));
			while (reader.readLine() != null)
				lines++;
			reader.close();
			while(!(lines%5==0))
				lines++;
			return lines;
	}
}