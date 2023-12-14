import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		char YN = ('Y');
		int randRange = 0;
		int guess = 0;
		int diff = 0;
		boolean repeat=true;
		
		while(repeat==true)
		{
		System.out.println("Set the difficulty. (1-3)");
		diff = scanner.nextInt();
		
		switch(diff)
		{
			case 1: System.out.println("Easy Mode."); randRange = 10; break;
			case 2: System.out.println("Normal Mode."); randRange = 20; break;
			case 3: System.out.println("Hard Mode."); randRange = 30; break;
			default: System.out.println("Not one of the options. Setting Extreme difficulty."); randRange = 5000; break;
		}
		
		for(int x=1; x>0; x--)
		{
		int awnser = rand.nextInt(randRange);
		
		System.out.println("Guess the number.");
		
		for(int i=0; i<5; i++)
		{
			guess = scanner.nextInt();
			
			if(guess==awnser)
			{
				System.out.println("Correct."); break;
			}
			else if(guess>=awnser)
			{
				System.out.println("Lower.");
			}
			else if(guess<=awnser)
			{
				System.out.println("Higher");
			}
		}
		System.out.println("Go again? Y/N");
		YN = scanner.next().charAt(0);
		switch(YN)
		{
			case 'Y': x++; break;
			case 'N': break;
			default: System.out.println("Not one of the optons. ending."); break;
		}
		System.out.println("Play on another difficulty? Y/N");
		YN = scanner.next().charAt(0);
		switch(YN)
		{
			case 'Y': repeat=true; break;
			case 'N': repeat=false; break;
			default: System.out.println("Not one of the optons. ending."); repeat=false; break;
		}
		}
	}
	}
}