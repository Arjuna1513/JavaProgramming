package arrayPrograms;

public class MaxAndMinFromAnArray 
{
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		a[0]=22;a[1]=33;a[2]=444;a[3]=100;a[4]=999;
		int max = a[0]; int min = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			else if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Max and Min values from array are as follows :"+max +"  "+min);
	}
}
