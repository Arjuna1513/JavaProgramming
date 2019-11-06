package practicePrograms;

public class ReversalOfAStringWithoutUsingExtraVariable 
{
	public static void main(String[] args) 
	{
		String str = "Malli";
		char[] chArray = str.toCharArray();
		int len = chArray.length;
		for(int i=0; i<len/2; i++)
		{
			char temp = chArray[i];
			chArray[i] = chArray[len-i-1];
			chArray[len-i-1] = temp;
		}
		System.out.println(chArray);
	}
}
