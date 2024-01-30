public class Matha
{
	public static double rnd(double a, int b)
	{//Round to the nearest tenths.
		return a=Math.round(a*b)/b;
	}
	public static double arrAddS(double[] arr, int l)
	{
		double a=0;
		for(int i=0;i<l;i++)
			a=a+arr[i];
		return a;
	}
}