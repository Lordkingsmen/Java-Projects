public class Main {
	
	public static void main(String[] args)
	{
		String name = "Christian";
		String Rname = "";
		char reverse;
		int y = 0;
		y = name.length()-1;
		
		System.out.println(name);
		
		for (int i=0; i<name.length(); i++)
	    {
			reverse= name.charAt(i);
			Rname= reverse+Rname;
	    }
		
		System.out.println(Rname);
		
		String Pname = "";
		char PLatin;
		String ay="ay";
		
		PLatin= name.charAt(y);
		Pname= PLatin+ay+name.substring(0,y);
		System.out.println(Pname);
		}
	}