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
}