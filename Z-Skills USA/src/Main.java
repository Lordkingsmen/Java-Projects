import java.util.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args)
	{
		double bPScale = 0;
		double persTrait = 7;
		double creTrait = 6;
		double deTrait = 6;
		double teamTrait = 1;
		double sum = 0;//0-4
		
		bPScale=diff(persTrait,creTrait,deTrait,teamTrait);
		System.out.println(bPScale=Math.sqrt(Math.abs(2*persTrait+(creTrait)*(creTrait)+2*deTrait+(3*teamTrait-creTrait))));
	}
	
	public static double diff(double traitPoints, double persTrait, double creTrait, double deTrait)
	{
		double traitDiff=traitPoints-5;
		double persDiff=persTrait-5;
		double creDiff=creTrait-5;
		double deDiff=deTrait-5;
		double totalDiff=0;
		
		return totalDiff=(totalDiff-(traitDiff+persDiff+creDiff+deDiff));
	}
}