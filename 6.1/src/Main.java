import java.io.*;
import java.util.*;

public class Main
{
	static String username = null;
	static String savename = null;
	static long points=0;
	
	public static void main(String[] args) throws IOException
	{
		String yesno;
		boolean YNConfirm = true;
		
		Scanner wordTyper = new Scanner(System.in);
		
		System.out.println("Load a existing save? (yes/no, no capitals)");
		while(YNConfirm==true)
		{
			yesno = wordTyper.next();
			YNConfirm=false;
			switch(yesno)
			{
				case "yes":
				System.out.println("Enter existing savename");
				savename = wordTyper.next();
				loadSave();
				break;
				
				case "no":
				System.out.println("Enter new save name.");
				savename = wordTyper.next();
				System.out.println("enter your username (no spaces)");
				username = wordTyper.next();
				System.out.println("Creating save file...");
				saveGame();
				break;
				
				default:
				YNConfirm=true;
				break;
			}
		}
		System.out.println(savename);
		wordTyper.close();
	}
	
	public static void loadSave() throws IOException
	{
		Scanner fileScan = new Scanner(new File(savename));
		int counter = 0;
		
		while (fileScan.hasNextLine())
		{
            String line = fileScan.nextLine();
            System.out.println(line);
            counter++;
            System.out.println(counter);
            switch(counter)
            {
            	case 1: savename=line; break;
            	case 2: username=line; break;
            	case 3: points=Integer.valueOf(line); break;
            	default: break;
            }
        }
		return;
	}
	
	public static void saveGame() throws IOException
	{
		PrintWriter writer = new PrintWriter(savename, "UTF-8");
		writer.println(savename);
		writer.println(username);
		writer.println(points);
		writer.close();
	}
}