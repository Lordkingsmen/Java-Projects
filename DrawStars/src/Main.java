import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input whole number for hours.");
		int hours = scanner.nextInt();
		drawStars(5);
		sayHello("Christian", hours);
	}

	private static void sayHello(String n, int a)
	{
		System.out.println("hello "+n+", in "+a+" hours you will sleep forever :)");
	}

	public static void drawStars(int s)
	{
		for(int i=0; i < s; i++)
		{
			System.out.print("*");
		}
	}
}