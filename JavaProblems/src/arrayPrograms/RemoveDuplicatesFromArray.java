package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray 
{
	public static void main(String[] args) 
	{
		int[] a = new int[9];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=5;
		a[6]=9;
		a[7]=2;
		a[8]=5;
		
		int uniqueEleCount = 0;
		for(int i=0; i<a.length; i++)
		{
			int count = 0;
			int temp = a[i];
			for(int j=0; j<a.length; j++)
			{
				if(a[j]==temp)
				{
					count++;
				}
			}
			if(count > 1)
			{
				a[i] = 0;
			}
			else if(count == 1)
			{
				uniqueEleCount++;
			}
		}
		
		int[] b = new int[uniqueEleCount];
		int j=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(b.length);
		for(Integer val : b)
		{
			System.out.println(val);
		}
	}
}
