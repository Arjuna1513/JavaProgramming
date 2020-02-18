package arrayPrograms;

public class ProgramToFindIndexOfAnArrayElement 
{
	public static void main(String[] args) 
	{
		int value = 100;
		int index = 0;
		System.out.println();
		int[] a = new int[5];
		a[0]=22;a[1]=33;a[2]=444;a[3]=100;a[4]=999;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==value)
			{
				index = i;
				break;
			}
		}
		if(index!=0)
		{
			System.out.println("Index of value "+value+" in an array is "+index);
		}
		else
		{
			System.out.println("Element doesn't present in an array");
		}
	}
}
