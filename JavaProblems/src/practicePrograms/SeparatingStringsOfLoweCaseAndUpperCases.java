package practicePrograms;

import java.util.ArrayList;
import java.util.List;

public class SeparatingStringsOfLoweCaseAndUpperCases 
{
	public static void main(String[] args) 
	{
		String[] str = new String[5];
//		str[0]="Ant";str[1]="bat";str[2]="Cat";str[3]="dog";str[4]="Eagle";
		List<String> str1 = new ArrayList<String>();
		str1.add("Ant");str1.add("bat");str1.add("Cat");str1.add("dog");str1.add("Eagle");
		List<String> lowStr = new ArrayList<String>();
		int upperCount = 0;
		int lowerCount = 0;
		for(int i=0; i<str1.size(); i++)
		{
			if(Character.isLowerCase(str1.get(i).charAt(0)))
			{
				lowStr.add(str1.get(i));
				str1.remove(i);
			}
//			else
//			{
//				str[i] = str[i].replace(str[i], "");
//			}
		}
		
		for(String s : str1)
		{
			System.out.print(s+":  ");
		}
		System.out.println();
		for(String s : lowStr)
		{
			System.out.print(s+":  ");
		}
	}
}
