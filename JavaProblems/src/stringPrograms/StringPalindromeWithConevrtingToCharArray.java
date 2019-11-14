package stringPrograms;

public class StringPalindromeWithConevrtingToCharArray 
{
	public static void main(String[] args) 
	{
		String str = "MallillaM";
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			revStr = revStr + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(revStr);
		if(str.equals(revStr))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
