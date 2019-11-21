package stringPrograms;

import java.util.Scanner;

public class CheckIf2ndStringContainsFirst 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 string values");
		String s1 = scan.next();
		String s2 = scan.next();
		if(s1.contains(s2))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("Do not contains");
		}
	}
}
