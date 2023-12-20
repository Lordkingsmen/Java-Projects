import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{//"throws InterruptedException" allows me to use thread sleep to time the lines
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Input number to select song. For example, 1 is for Reckless Battery Burns");
			int input = scanner.nextInt();
			switch(input)
			{//adds user input so the user can select the song
		    	case 1: RecklessBatteryBurns(); break;
		    	case 2: break;
			}
		}
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}
    public static void sleep(int time)
    {//this lets me use thread sleep easier, and i don't need to add throw  to every static void.
        try
        {
           Thread.sleep(time);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
	public static void RecklessBatteryBurns()
	{//the entire song in a method so i can call it from user input
		RBBVerse1();
		RBBVerse2();
		RBBPreChorus1();
		RBBChorus1();
		RBBBridge1();
		RBBVerse3();
		RBBVerse4();
		RBBPreChorus2();
		RBBChorus2();
		RBBBridge2();
		RBBChorus3();
	}
	public static void RBBVerse1()
	{
		System.out.println("Sheer thrills and frivolities");
		sleep(1000);
		System.out.println("Erratum discussions held under my control");
		sleep(1000);
		System.out.println("Conveyed in tongue, said again and again");
		sleep(1000);
		System.out.println("While waiting for the hour");
		sleep(1000);
		System.out.println("The shadows standing still");
		sleep(1000);
	}
	public static void RBBVerse2()
	{
		System.out.println("They dance on the edge of life");
		sleep(1000);
		System.out.println("They whisper a story told of prepossessing image");
		sleep(1000);
		System.out.println("The world is spinning, the sun so bright");
		sleep(1000);
		System.out.println("It's full of hatred and doting");
		sleep(1000);
		System.out.println("Get out of my mouth");
		sleep(1000);
	}
	public static void RBBPreChorus1()
	{
		RBBRepeatable1();
		System.out.println("Inattentive signs on a wall");
		sleep(1000);
		System.out.println("Long lost for sure");
		sleep(1000);
	}
	public static void RBBChorus1()
	{
		System.out.println("Aren't I hurting anyone?");
		sleep(1000);
		System.out.println("Perhaps it's time for me to tear apart");
		sleep(1000);
		System.out.println("For what it is I've been");
		sleep(1000);
		System.out.println("Denote my place within humanity");
		sleep(1000);
		System.out.println("Projecting by my will");
		sleep(1000);
		System.out.println("I've been amassing solid iron claws");
		sleep(1000);
		System.out.println("Ignore the rottenness");
		sleep(1000);
		System.out.println("And my recitals will decay in a flash!");
		sleep(1000);
	}
	public static void RBBBridge1()
	{
		System.out.println("My stomach turned at the thought of the stars");
		sleep(1000);
		System.out.println("And my heart pounded louder than the ones I had before");
		sleep(1000);
		System.out.println("Silencing cries when I get into bed");
		sleep(1000);
		System.out.println("We can help it by letting the demons ravage it all");
		sleep(1000);
		System.out.println("I know it's late, but we have to get home");
		sleep(1000);
		System.out.println("Endless staining and fading, these scars, indefinite");
		sleep(1000);
		System.out.println("Wondering what it would be like to be locked");
		sleep(1000);
		System.out.println("In a room with electrical lights that burn like a match");
		sleep(1000);
	}
	public static void RBBVerse3()
	{
		System.out.println("Remember the human heart");
		sleep(1000);
		System.out.println("Began as a vessel hallowed out to be imparted");
		sleep(1000);
		System.out.println("It can't be hurt, but it can be killed");
		sleep(1000);
		System.out.println("Begins to burn in a spiral of animosity");
		sleep(1000);
	}
	public static void RBBVerse4()
	{
		System.out.println("Its nerve endings long ago");
		sleep(1000);
		System.out.println("Gone scarlet and white as they predicted not returning");
		sleep(1000);
		System.out.println("They stared intently at twilight's face");
		sleep(1000);
		System.out.println("Through the open door, through the flowers");
		sleep(1000);
		System.out.println("As she unfurled her will");
		sleep(1000);
	}
	public static void RBBPreChorus2()
	{
		RBBRepeatable1();
		System.out.println("All the more when we share a kiss");
		sleep(1000);
	}
	public static void RBBChorus2()
	{
		System.out.println("Further, for thy sake!");
		sleep(1000);
		System.out.println("Open my mouth and scream aloud with me!");
		sleep(1000);
		System.out.println("Arise and then break out!");
		sleep(1000);
		System.out.println("Denote my place within humanity!");
		sleep(1000);
		System.out.println("The image of a face is on a wall with solid iron claws!");
		sleep(1000);
		System.out.println("A happy face of me");
		sleep(1000);
		System.out.println("It's not a nightmare, just some nonsense!");
		sleep(1000);
	}
	public static void RBBBridge2()
	{
		RBBRepeatable2();
		RBBRepeatable2();
		System.out.println("Without making him angry again");
		sleep(1000);
	}
	public static void RBBChorus3()
	{
		System.out.println("I'm too worthless to return");
		sleep(1000);
		System.out.println("To playing such a harmful role again");
		sleep(1000);
		System.out.println("Eventually, I'll become");
		sleep(1000);
		System.out.println("The pain that everyone's abetted");
		sleep(1000);
		System.out.println("If you ever die, what will your memory start looking like?");
		sleep(1000);
		System.out.println("That's the way it is");
		sleep(1000);
		System.out.println("Remember? Stomach holes burning");
		sleep(1000);
		System.out.println("In the heavy years, wide-open eyes pervaded in unease!");
		sleep(1000);
		System.out.println("But love still penetrates, it's on our lips");
		sleep(1000);
		System.out.println("It shows, because of you");
		sleep(1000);
		System.out.println("Projecting by my will, I've been amassing solid iron claws!");
		sleep(1000);
		System.out.println("Ignore the rottenness, and see your beautiful, bewildered face!");
		sleep(1000);
	}
	public static void RBBRepeatable1()
	//one of the two repeated segments in this five minute and thirty second song
	{
		System.out.println("Invite suicidation");
		sleep(1000);
		System.out.println("Transfer enumeration");
		sleep(1000);
		System.out.println("Dyed and used it for an infestation");
		sleep(1000);
		System.out.println("In the future, when you and I are");
		sleep(1000);
		System.out.println("Eating and handcrafting theory");
		sleep(1000);
		System.out.println("Fingers crawl across and playing");
		sleep(1000);
		System.out.println("He's grinning, making memories");
		sleep(1000);
	}
	public static void RBBRepeatable2()
	//the second of the two repeated segments in this five minute and thirty second song
	{
		System.out.println("My hands grow numb when I think of what's wrong");
		sleep(1000);
		System.out.println("My mind full of anything that's left of her");
		sleep(1000);
		System.out.println("Let us focus on getting through the day");
		sleep(1000);
	}
}