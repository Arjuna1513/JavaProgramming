package practicePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversalOfAStringUsingList 
{
	public static void main(String[] args) 
	{
		String str = "Malli";
		char[] chArray = str.toCharArray();
		List<Character> chList = new ArrayList<Character>();
		for(char cr : chArray)
		{
			chList.add(cr);
		}
		Collections.reverse(chList);
//		str = chList.toString();
		String revString = "";
		for(char cr : chList)
		{
			revString = revString + cr;
		}
		
		System.out.println("Reverse string value is "+ revString);
	}
}
