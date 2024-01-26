public class rnd
{
	public static double ten(double a)
	{//Round to the nearest tenths.
		return a=Math.round(a * 10.0) / 10.0;
	}
	public static double hun(double a)
	{//Round to the nearest hundredths.
		return a=Math.round(a * 100.0) / 100.0;
	}
	public static double tho(double a)
	{//Round to the nearest thousandths.
		return a=Math.round(a * 1000.0) / 1000.0;
	}
	public static double tTh(double a)
	{//Round to the nearest ten thousandths.
		return a=Math.round(a * 10000.0) / 10000.0;
	}
}