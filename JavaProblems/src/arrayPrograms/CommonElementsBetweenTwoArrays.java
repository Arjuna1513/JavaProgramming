package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsBetweenTwoArrays 
{
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		int[] b = new int[6];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		b[0]=9;
		b[1]=8;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		b[5]=1;
		
		for(int i=0; i<a.length; i++)
		{
			int count = 0;
			int temp = a[i];
			for(int j=0; j<b.length; j++)
			{
				if(b[j] == temp)
				{
					count++;
				}
			}
			if(count > 0)
			{
				map.put(temp, count);
			}
		}
		for(Map.Entry m:map.entrySet())
		{
			System.out.print(m.getKey()+"  :  ");
			System.out.println(m.getValue());
		}
	}
}
