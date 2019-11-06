package practicePrograms;

public class OccOfAplhaDigitSpecInStrWithoutCovertingToCharArray 
{
	public static void main(String[] args) 
	{
		int smallLetCount = 0;
		int capLetCount = 0;
		int digitCount = 0;
		int specCount = 0;
		String str = "a1b2@ eDfY*";
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				{
					capLetCount++;
				}
				else
				{
					smallLetCount++;
				}
			}
			else if(Character.isDigit(str.charAt(i)))
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
