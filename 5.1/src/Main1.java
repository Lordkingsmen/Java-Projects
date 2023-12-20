import java.util.Scanner;
public class Main1 {
	public static void main(String[] args)
	{
		try (Scanner scanner = new Scanner(System.in))
		{
			System.out.println("choose coffee (lowercase only)");
			String c = scanner.nextLine();
			int r = 0;
			coffeeRating(r, c);
		}
	}
	
	public static String coffeeRating(int r, String c)
	{
		switch(c)
		{
			case "black coffee": r=1; break;
			default: c=("Not a Coffee (did you misspell something)"); System.out.println(c); return c;
		}
		switch(r)
		{
	    	case 1: c=("test1"); System.out.println(c); break;
	    	case 2: c=("test2"); System.out.println(c); break;
	    	case 3: c=("test3"); System.out.println(c); break;
	    	case 4: c=("test4"); System.out.println(c); break;
	    	case 5: c=("test5"); System.out.println(c); break;
	    	default: c=("not a whole number between 1-5"); System.out.println(c); return c;
		}
		
		return c;
	}
}