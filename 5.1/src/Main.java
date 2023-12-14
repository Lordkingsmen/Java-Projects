public class Main {
	public static String quadrant(double d, double e)
	{
		String quad = null;
		if((0 >= d)&&(0>=e))
		{
			quad = ("X+Y+");
		}
		else if((0 <= d)&&(0>=e))
		{
			quad = ("X-Y+");
		}
		else if((0 <= d)&&(0<=e))
		{
			quad = ("X-Y-");
		}
		else if((0 >= d)&&(0<=e))
		{
			quad = ("X+Y-");
		}
		else if((0 == d)&&(0==e))
		{
			quad = ("X=Y=");
		}
		else if((0 == d)&&(0>=e))
		{
			quad = ("X=Y+");
		}
		else if((0 == d)&&(0<=e))
		{
			quad = ("X=Y-");
		}
		else if((0 >= d)&&(0==e))
		{
			quad = ("X+Y=");
		}
		else if((0 <= d)&&(0==e))
		{
			quad = ("X-Y=");
		}
		return quad;
	}
	
	public static void main(String[] args)
	{
		System.out.println(quadrant(12.4, 17.8));
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(-15.2, -3.1));
        System.out.println(quadrant(4.5, -4.5));
        System.out.println(quadrant(0.0, 0.0));
        System.out.println(quadrant(12.5, 0.0));
        System.out.println(quadrant(0.0, 2.3));
	}
}