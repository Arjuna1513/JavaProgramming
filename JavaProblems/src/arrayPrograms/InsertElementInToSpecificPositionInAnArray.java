package arrayPrograms;

import java.util.Arrays;

public class InsertElementInToSpecificPositionInAnArray 
{
	public static void main(String[] args) 
	{
		int index = 0;
		int newValue = 777;
		int[] a = new int[5];
		int[] b = new int[a.length+1];
		a[0]=22;a[1]=33;a[2]=444;a[3]=100;a[4]=999;
		for(int i=0; i<index; i++)
		{
			b[i] = a[i];
		}
		b[index] = newValue;
		for(int i = index; i<a.length; i++)
		{
			b[i+1] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
