import java.io.*;
import java.util.*;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		String[] chirp = new String[linecounter()];
		int[] selectedNumbers = {2,3,4,3,2};
		Scanner wordTyper = new Scanner(System.in);
		int awnser;
		
		readnames(chirp);
		System.out.println("Length of names you want to find");
		awnser = wordTyper.nextInt();
		findnames(chirp, awnser);
		wordTyper.close();
		rotateRight(chirp);
		System.out.println(palindromeChecker(selectedNumbers));
		numStart();
	}
	
	public static void readnames(String[] chirp) throws IOException
	{
		Scanner fileScan = new Scanner(new File("C:\\Users\\avelichr000\\Documents\\Java Projects\\Namefinder\\src\\names.txt"));
		int counter = 0;
		
		while (fileScan.hasNextLine())
		{
			counter++;
            chirp[counter-1] = fileScan.nextLine();
        }
		System.out.println(Arrays.toString(chirp));
	}
	
	public static void findnames(String[] chirp, int awnser)
	{
		String names = "";
		for(int i = 0; i < chirp.length; i++)
			if(chirp[i].length() == awnser)
				names += chirp[i] + " ";
		System.out.println(names);
	}
	
	public static int linecounter() throws IOException
	{
	      	int lines = 0;
	      	BufferedReader reader = new BufferedReader(new FileReader("src\\names.txt"));
				while (reader.readLine() != null) lines++;
			reader.close();
			return lines;
	}
	
	public static String[] redshift(String[] chirper)
	{
		rotateRight(chirper);
		return chirper;
	}
	
	public static void rotateRight(String[] chirper)
	{
        String lastElement = chirper[chirper.length - 1];
        for (int i = chirper.length - 1; i > 0; i--)
            chirper[i] = chirper[i - 1];
        chirper[0]=lastElement;
        System.out.println(Arrays.toString(chirper));
    }
	
	public static boolean palindromeChecker(int[] list)
	{
		for(int i=0;i<list.length/2;i++)
			if(list[i]!=list[list.length-1-i])
				return false;
			return true;
	}

	public static void numStart()
	{
		Scanner input1 = new Scanner("8 3 0 1 2 2 0 7 2");
	    Scanner input2 = new Scanner("1 2   3 4 5 \n 6 7 8 9 0  ");
	    Scanner input3 = new Scanner("");
	    Scanner input4 = new Scanner("5 5 5 5 5 5 5 7 0");

	    System.out.println("counts from input1: " + Arrays.toString(numCount(input1)));
	    System.out.println("counts from input2: " + Arrays.toString(numCount(input2)));
	    System.out.println("counts from input3: " + Arrays.toString(numCount(input3)));
	    System.out.println("counts from input4: " + Arrays.toString(numCount(input4)));
	}
	
	public static int[] numCount(Scanner input)
	{
	      int[] counts = new int[10];
	      while (input.hasNextInt())
	      {
	    	  int num = input.nextInt();
	    	  counts[num]++;
	      }
	      return counts;
	}
}