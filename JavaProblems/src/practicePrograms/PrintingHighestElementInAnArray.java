package practicePrograms;

import java.util.Scanner;

public class PrintingHighestElementInAnArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter size of an array");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] array = new int[x];
		System.out.println("Please enter elements");
		for(int i=0; i<x; i++)
		{
			array[i] = scan.nextInt();
		}
		
		int highest = array[0];
		for(int i=1; i<x; i++)
		{
			if(array[i] > highest)
			{
				highest = array[i];
			}
		}
		
		System.out.println(highest);
	}
}
