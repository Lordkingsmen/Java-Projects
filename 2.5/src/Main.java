public class Main {

	public static void main(String[] args)
	{
		int sum =0;
		for (int i = 100; i>0; i--)
		{
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		System.out.println("+----+");
		for (int b = 3; b > 0; b--)
		{
			System.out.println("\\    /\r\n"
							 + "/    \\");
		}
		System.out.println("+----+");
	}

}