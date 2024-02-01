public class Matha
{
	public static double rnd(double a, double b)
	{//Rounds to the passed variable d placement.
		return a=Math.round(a*b)/b;
	}
	
	public static double arrAddS(double[] arr, int l)
	{
		double a=0;
		for(int i=0;i<l;i++)
			a=a+arr[i];
		return a;
	}
	
	public static double diff(double a)
	{//gets the difference of the number from 5.
		return (a-5);
	}
	
	public static double sAvg(double persTrait, double creTrait, double deTrait, double teamTrait)
	{//does the actual problem and returns the answer.
		return (Math.sqrt(Math.abs(2*persTrait+(creTrait>0?(creTrait)*(creTrait):-(creTrait)*(creTrait))+2*deTrait+(3*teamTrait-creTrait))));
	}
	
	public static double[] avg(double[][] avgScore, int a)
	{//This gets the average score of the participant.
		double[] avgTotal=new double[a];
		for(int i=0;i<a;i++)
			avgTotal[i]=Matha.rnd(Matha.arrAddS(avgScore[i],5)/5,100);
		return avgTotal;
	}
}