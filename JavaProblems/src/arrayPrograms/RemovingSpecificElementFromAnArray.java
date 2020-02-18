package arrayPrograms;

public class RemovingSpecificElementFromAnArray 
{
	public static void main(String[] args) 
	{
		int value = 100;
		int[] a = new int[5];
		a[0]=22;a[1]=33;a[2]=444;a[3]=100;a[4]=999;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==value)
			{
				a[i]='\0';
			}
		}
		for(Integer i : a)
		{
			System.out.println(i);
		}
		
	}
}
