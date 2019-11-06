package practicePrograms;

public class PalindromeOfANumber 
{
	public static void main(String[] args) 
	{
		int val = 99599;
		int x = val;
		int reminder = 0;
//		int quotient = 0;
		int result = 0;
		while(x != 0)
		{
			reminder = x % 10;
			result = result * 10 + reminder;
			x = x / 10;
		}
		System.out.println(result);
		System.out.println(val);
		if(val == result)
		{
			System.out.println("Given value is a palindrome");
		}
	}
}
