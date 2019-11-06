package practicePrograms;

import java.util.ArrayList;

public class FibonacciUntilTheLatestValueIsLessThan100 
{	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int i = 2;
		while(true)
		{
			int sum = list.get(i-2)+list.get(i-1);
			if(sum < 100)
			{
				list.add(sum);
				i++;
			}
			else
			{
				break;
			}
		}
		for(int x : list)
		{
			System.out.println(x);
		}
	}
}
