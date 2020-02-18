package arrayPrograms;

public class ArrayContainsSpecificValue 
{
	public static void main(String[] args) 
	{
		int value = 100;
		int flag = 0;
		System.out.println();
		int[] a = new int[5];
		a[0]=22;a[1]=33;a[2]=444;a[3]=100;a[4]=999;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==value)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Array contains given element");
		}
		else
		{
			System.out.println("Array doesn't contains given element");
		}
	}
}
