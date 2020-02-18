package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInAnIntegerArray 
{
	public static void main(String[] args) 
	{
		int[] a = new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=1;
		a[6]=2;
		a[7]=33;
		a[8]=41;
		a[9]=5;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
			int count = 0;
			int tempVal = a[i];
			for(int j=0; j<a.length; j++)
			{
				if(a[j] == tempVal)
				{
					count++;
				}
			}
			if(count > 1)
			{
				map.put(tempVal, count);
			}
		}
		for(Map.Entry<Integer, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
