import java.util.Scanner;

public class Main2
{
	public static void main(String[] args)
	{
		boolean P1 = false;
		String Password;
		Scanner scanner = new Scanner(System.in);
		
		while(P1 == false)
		{
			System.out.println("Input Password.");
			Password = scanner.nextLine();
			switch(Password)
			{
				case "1234": P1=true; break;
				default: System.out.println("Incorrect username or password.");
			}
		}
		scanner.close();
	}
}