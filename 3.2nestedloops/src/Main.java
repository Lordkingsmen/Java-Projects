public class Main {

	public static void main(String[] args)
	{
		for(int i=0, j=0; i<2; i++)
		{
			liney();
			for(; j<3; j++)
			{
				spacey();
			}
		}
	}
	public static void liney()
	{
		System.out.println("#------------------------------#");
	}
	public static void spacey()
	{
		System.out.println("#                              #");
	}
}