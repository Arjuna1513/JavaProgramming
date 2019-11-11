package practicePrograms;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] array = new int[5];
		array[0]=111;array[1]=22;array[2]=456;array[3]=62;array[4]=333;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int x : array)
		{
			System.out.println(x);
		}
	}
}
