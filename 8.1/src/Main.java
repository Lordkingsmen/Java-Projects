import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
		
		String[][] arrNames = 
			{
				{"sett","galio"},
				{"shaco","warwick"},
				{"darius","garen"},
			};
		System.out.println(Arrays.deepToString(arrNames));
		
        for(String[] sr: arrNames){
            for(String s: sr){
                System.out.print(s+" ");
            }
            System.out.println();
        }
	}
	
	public int dateFashion(int you, int date)
	{
		if(you>=8||date>=8)
		{
			if(you<2&&date<2)
				return 2;
		}
		else if(you<2&&date<2)
			return 1;
		return 0;
	}
}