package practicePrograms;

import java.util.ArrayList;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		for(int i=2; i<10; i++)
		{
			list.add(list.get(i-2)+list.get(i-1));
			//If u do not define generic Integer for list the u need to type cast the list.get(i) value
			//b'coz the return value of list.get(i) is Object.
		}
		for(int i : list)
		{
			System.out.println(i);
		}
	}
}
