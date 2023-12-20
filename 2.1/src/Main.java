import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		try (Scanner Calc = new Scanner(System.in))
		{
			double n1;
			double n2;

			while(true)
			{
			System.out.println("first number");
			n1 = Calc.nextDouble();
			System.out.println("second number");
			n2 = Calc.nextDouble();
			System.out.println("Operator");
			char operator = Calc.next().charAt(0);
			
				if(operator == '+')
				{
					System.out.println("Awnser is " + (n1 + n2));
				}
				else if(operator == '-')
				{
					System.out.println("Awnser is " + (n1 - n2));
				}
				else if(operator == '*')
				{
					System.out.println("Awnser is " + (n1 * n2));
				}
				else if(operator == '/')
				{
					System.out.println("Awnser is " + (n1 / n2));
				}
				else if(operator == '%')
				{
					System.out.println("Awnser is " + (n1 % n2));
				}

			}
		}
		catch(Exception e)
        {
            e.printStackTrace();
        }
	}
}