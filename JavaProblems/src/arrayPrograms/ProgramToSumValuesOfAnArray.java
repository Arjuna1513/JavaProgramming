package arrayPrograms;

public class ProgramToSumValuesOfAnArray
{
	public static void main(String[] args) 
	{
		int sum=0;
		int[] arr = new int[5];
		arr[0]=111;arr[1]=222;arr[2]=333;arr[3]=444;arr[4]=555;
		for(Integer i : arr)
		{
			sum = sum + i;
		}
		System.out.println("Sum of all elements in an array is : "+sum);
	}
}
