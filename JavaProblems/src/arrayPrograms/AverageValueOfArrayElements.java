package arrayPrograms;

public class AverageValueOfArrayElements 
{
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Average value of array elements is : "+sum/a.length);
	}
}
