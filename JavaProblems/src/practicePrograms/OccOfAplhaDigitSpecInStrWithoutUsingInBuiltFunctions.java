package practicePrograms;

public class OccOfAplhaDigitSpecInStrWithoutUsingInBuiltFunctions 
{
	public static void main(String[] args) 
	{
		int smallLetCount = 0;
		int capLetCount = 0;
		int digitCount = 0;
		int specCount = 0;
		String str = "a1bXXX2@ eDfY*9io^^^";
		char[] arr = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(arr[i] >= 'A' && arr[i] <= 'Z')
			{
				capLetCount++;
			}
			else if(arr[i] >= 'a' && arr[i] <= 'z')
			{
				smallLetCount++;
			}
			else if(arr[i] >= '0' && arr[i] <= '9')
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
