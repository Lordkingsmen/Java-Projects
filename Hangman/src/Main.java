import java.io.*;
import java.util.*;

public class Main
{
	static boolean isWin;
	
	public static void main(String[] args) throws IOException
	{
		Scanner wordTyper = new Scanner(System.in);	
		
		Random aSelect = new Random();
		
		int wordLength = lineCounter();
		int tries = 0;
		int totalTries = 6;
		
		boolean win;

		String[] words = new String[wordLength];
		
		words = readNames(words);
		
		String answer = words[aSelect.nextInt(wordLength)+1];
		
		int answerL = answer.length();
		
		String hiddenA = gameSet(answerL);
		
		while(!(hiddenA.equalsIgnoreCase(answer))&&tries<=totalTries)
		{
			hiddenA=gamePlay(wordTyper,hiddenA,answer,answerL,aSelect);
			tries++;
		}
		if(isWin)
			System.out.println("You win.");
		else
			System.out.println("You Lose. The awnser was "+answer+".");
		wordTyper.close();
	}
	
	public static int lineCounter() throws IOException
	{//Any file matching the name can be read and used for your words in this game.
	      	int lines = 0;
	      	BufferedReader reader = new BufferedReader(new FileReader("src\\words.txt"));
				while (reader.readLine() != null) lines++;
			reader.close();
			return lines;
	}
	
	public static String[] readNames(String[] wordSet) throws IOException
	{//This selects a words at random from the words.txt file for the game.
		Scanner fileScan = new Scanner(new File("src\\words.txt"));
		int counter = 0;
		
		while (fileScan.hasNextLine())
		{
			counter++;
			wordSet[counter-1] = fileScan.nextLine();
        }
		fileScan.close();
		return wordSet;
	}
	
	public static String gameSet(int answerL)
	{//This sets a new String which will be the word hidden.
		String hidden = "_".repeat(answerL);
		System.out.println(hidden);
		return hidden;
	}
	
	public static String gamePlay(Scanner wordTyper,String hidden,String answer,int answerL, Random hSelect)
	{//This code takes your input and checks to see if it matches, or is the answer to see if you win.
		String guessAll = wordTyper.next();
		char guess = guessAll.charAt(0);
		if(guessAll.equalsIgnoreCase("hint"))
			guessAll.charAt(hSelect.nextInt(answer.length())+1);
		else
			switch(guessAll.length())
			{
				case 1:
					for(int i=0;i<answerL;i++)
					{
						if(guess==answer.charAt(i))
						{
							char[] answerC = hidden.toCharArray();
							answerC[i] = guess;
							hidden = String.valueOf(answerC);
						}
					}
					System.out.println(hidden);
					return hidden;
				default:
					if(guessAll.equalsIgnoreCase(answer))
					{
						isWin=true;
						return guessAll;
					}
					else
						return hidden;
		}
	}
}