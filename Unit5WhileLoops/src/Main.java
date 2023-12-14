import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		multiplyer(5);
		
		Random rand = new Random();
		int num = rand.nextInt(10)+1;
		randomize(num, rand);
	}
	public static void multiplyer(int n)
	{
		int multiples=n;
		while(multiples<=100)
		{
			multiples+=5;
			System.out.print(multiples + " ");
		}
		System.out.println();
	}
	
	public static void randomize(int num, Random rand)
	{
		int randnum = num;
		while(randnum != 6)
		{
			System.out.print(randnum + " ");
			randnum = rand.nextInt(10)+1;
		}
		System.out.print(randnum);
	}
}