package stringPrograms;

import java.util.Arrays;

public class StringAnagramsType2 
{
	public static void main(String[] args) 
	{
		String s1 = "LisTeN";
		String s2 = "SilENt";
		if(s1.length() != s2.length())
		{
			System.out.println("Strings "+s1+" and "+s2+ "cannot be anagrams since lengths are not equal");
			System.exit(0);
		}
		char[] ar1 = s1.toLowerCase().toCharArray();
		char[] ar2 = s2.toLowerCase().toCharArray();
		
		for(int i=0; i<ar1.length; i++)
		{
			for(int j=0; j<ar1.length-1; j++)
			{
				if(ar1[j]>ar1[j+1])
				{
					char temp = ar1[j];
					ar1[j] = ar1[j+1];
					ar1[j+1] = temp;
				}
			}
		}
		for(int i=0; i<ar2.length; i++)
		{
			for(int j=0; j<ar2.length-1; j++)
			{
				if(ar2[j]>ar2[j+1])
				{
					char temp = ar2[j];
					ar2[j] = ar2[j+1];
					ar2[j+1] = temp;
				}
			}
		}
		
		if(Arrays.equals(ar1, ar2))
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		
	}
}
