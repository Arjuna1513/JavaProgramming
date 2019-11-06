package practicePrograms;

public class FindingNumOfDigAlphasSpeChrsInAString 
{
	public static void main(String[] args) 
	{
		int smallLetCount = 0;
		int capLetCount = 0;
		int digitCount = 0;
		int specCount = 0;
		String str = "a1B 2C3d @e#";
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			if(Character.isAlphabetic(arr[i]))
			{ 
				if(arr[i] >= 'A' && arr[i] <= 'Z')
				{
					capLetCount++;
				}
				else
				{
					smallLetCount++;
				}
			}
			else if(Character.isDigit(arr[i]))
			{
				digitCount++;
			}
			else
			{
				specCount++;
			}
		}
		
		System.out.println("Num of special chars in a String :"+specCount);
		System.out.println("Num of Capital letters in a String is :"+capLetCount);
		System.out.println("Num of small letters in a String is :"+smallLetCount);
		System.out.println("Num of digits in a String is :"+digitCount);
		
	}
}
