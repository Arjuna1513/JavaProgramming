package arrayPrograms;

import java.util.Arrays;

public class InsertElementInToSpecificPositionInAnArrayType2 
{
	public static void main(String[] args) 
	{
		int index = 4;
		int newValue = 777;
		int[] a = new int[5];
		int[] b = new int[a.length+1];
		a[0]=22;a[1]=33;a[2]=444;a[3]=100;a[4]=999;
		for(int i=0; i<b.length; i++)
		{
			if(i < index)
			{
				b[i]=a[i];
			}
			else if(i == index)
			{
				b[index] = newValue;
			}
			else
			{
				b[i] = a[i-1];
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
}
