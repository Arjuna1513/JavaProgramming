package arrayPrograms;

import java.util.Arrays;

public class ReverseIntegerArray 
{
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
		int n = a.length-1;
		for(int i=0; i< a.length/2; i++)
		{
			int temp = a[i];
			a[i] = a[n-i];
			a[n-i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
