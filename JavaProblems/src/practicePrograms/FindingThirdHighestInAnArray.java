package practicePrograms;

public class FindingThirdHighestInAnArray 
{
	public static void main(String[] args) 
	{
		int[] array = new int[12];
		array[0] = 100;
		array[1] = 33;
		array[2] = 55;
		array[3] = 69;
		array[4] = 106;
		array[5] = 111;
		array[6] = 22;
		array[7] = 79;
		array[8] = 104;
		array[9] = 121;
		array[10] = 117;
		array[11] = 116;
		
		int fh = array[0];
		int sh = array[0];
		int th = array[0];
		
		for(int i=1; i<array.length; i++)
		{
			if(array[i] > fh)
			{
				th = sh;
				sh = fh;
				fh = array[i];
			}
			else if(array[i] > sh)
			{
				th = sh;
				sh = array[i];
			}
			else if(array[i] > th)
			{
				th = array[i];
			}
		}
		
		System.out.println(fh);
		System.out.println(sh);
		System.out.println(th);
	}
}
