import java.io.*;
import java.util.*;

public class Main
{
	static String dicerolls = "dicerolls";
	static int[][] diceP;
	static Random rand = new Random();
	static Scanner scanner = new Scanner(System.in);
	static int pTurn=1;
	
	public static void main(String[] args) throws IOException
	{
		String pAMT;
		System.out.println("Enter how many players there will be");
		pAMT = scanner.nextLine();
		diceP = new int[Integer.parseInt(pAMT)][5];
		System.out.println("Player "+pTurn+"'s turn!");
		rolldice();
		dicematch();
	}
	
	public static void rolldice() throws IOException
	{
		boolean[] diceK = new boolean[5];
		String diceNs;
		for(int i=0;i<=4;i++)
		{
			int num = rand.nextInt(6)+1;
			System.out.print(num + (" "));
			diceP[pTurn-1][i]=num;
		}
		System.out.println();
		System.out.println("enter the number of what dice you want to keep (1-5, seperate numbers with spaces.)");
		diceNs = scanner.nextLine();
		dicerolls(diceNs);
		Scanner fileScan = new Scanner(new File(dicerolls));
		
		while(fileScan.hasNextInt())
		{
			int diceN = fileScan.nextInt();
			switch(diceN)
			{
				case 1 -> diceK[0]=true;
				case 2 -> diceK[1]=true;
				case 3 -> diceK[2]=true;
				case 4 -> diceK[3]=true;
				case 5 -> diceK[4]=true;
			}
		}
		for(int i=0;i<=4;i++)
		{
			if(diceK[i]==true)
			{
				continue;
			}
			else if(diceK[i]==false)
			{
				int num = rand.nextInt(6)+1;
				diceP[pTurn-1][i]=num;
			}
		}
		
		fileScan.close();
	}
	
	public static int[] checkdice()
	{
		int[] arr = new int [6];
		for(int i=0; i<diceP[pTurn-1].length; i++)
		{
			arr[diceP[pTurn-1][i]-1]++;
		}
		return arr;
	}
	
	public static void dicerolls(String numbers) throws IOException
	{
		PrintWriter writer = new PrintWriter(dicerolls, "UTF-8");
		writer.println(numbers);
		writer.close();
	}
	
	public static void dicematch() {
        int dice[] = checkdice();

        boolean[][] boolarr = new boolean[6][6];

        for(int i=0; i< boolarr.length; i++){
            boolarr[i][dice[i]] = true;
        }
        /*for(int i=0; i< boolarr.length; i++)
        {
            if(boolarr[i][dice[i]] == true)
            {
            	System.out.println("lalala " +dice[i]);
            }
        }*/
        for(boolean[] br: boolarr){
            for(boolean b: br){
                System.out.print((b)?"."+b+". ":b+" ");
            }
            System.out.println();
        }
    }
}