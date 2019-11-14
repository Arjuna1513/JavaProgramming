package stringPrograms;

import java.util.Scanner;

public class RemoveOccurancesOfAGivenCharacterInAString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("Enter the character to be removed from the string");
		char c = scan.next().charAt(0);
		String newStr = "";
		//char[] chr = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==c)
			{
				continue;
			}
			else
			{
				newStr=newStr+str.charAt(i);
			}
		}
		System.out.println("New string after removing character "+c+" from string "+str+" is \n"+newStr);
		
	}
}
