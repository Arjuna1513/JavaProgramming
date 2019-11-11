package practicePrograms;

public class SecondHighestNumberInArray 
{
	public static void main(String[] args) 
	{
		int[] array = new int[5];
		array[0] = 100;
		array[1] = 33;
		array[2] = 55;
		array[3] = 69;
		array[4] = 101;
		
		int fh = array[0];
		int sh = array[0];
		
		for(int i=1; i<array.length; i++)
		{
			if(array[i] > fh)
			{
				sh = fh;
				fh = array[i];
			}
		}
		
		System.out.println(fh);
		System.out.println(sh);
	}
}
