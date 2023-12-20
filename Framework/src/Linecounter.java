import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Linecounter {
	public static int linecounter() throws IOException
	{
	      	int lines = 0;
	      	BufferedReader reader = new BufferedReader(new FileReader("src\\words.txt"));
			{
				while (reader.readLine() != null) lines++;
			}
			reader.close();
			return lines;
	}
}
