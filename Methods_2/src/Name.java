public class Name
{
	public static void main(String[] args) 
	{
		FirstName(); LastName();
		NewLine(); FirstName(); MiddleName(); LastName();
		NewLine(); LastName(); FirstName();
		NewLine(); LastName(); MiddleName(); FirstName();
	}
	public static void FirstName()
	{
		System.out.print
				("Christian ");
	}
	public static void MiddleName()
	{
		System.out.print
				("Angel ");
	}
	public static void LastName()
	{
		System.out.print
				("Avelino-Miller ");
	}
	public static void NewLine()
	{
		System.out.print
				("\r\n");
	}
}