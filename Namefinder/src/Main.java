import java.io.*;
import java.util.*;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		String[] chirp = new String[linecounter()];
		Scanner wordTyper = new Scanner(System.in);
		int awnser;
		
		readnames(chirp);
		System.out.println("Length of names you want to find");
		awnser = wordTyper.nextInt();
		findnames(chirp, awnser);
		wordTyper.close();
		rotateRight(chirp);
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
		return;
	}
	
	public static void findnames(String[] chirp, int awnser)
	{
		String names = "";
		for(int i = 0; i < chirp.length; i++)
			if(chirp[i].length() == awnser)
			{
				names += chirp[i] + " ";
			}
		System.out.println(names);
	}
	
	public static int linecounter() throws IOException
	{
	      	int lines = 0;
	      	BufferedReader reader = new BufferedReader(new FileReader("src\\names.txt"));
			{
				while (reader.readLine() != null) lines++;
			}
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
        {
            chirper[i] = chirper[i - 1];
        }
        chirper[0]=lastElement;
        System.out.println(Arrays.toString(chirper));
    }
}