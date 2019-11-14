package stringPrograms;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String str = "mallillam";
		String revStr="";
		char[] chr = str.toCharArray();
		int len = chr.length/2;
		int n = chr.length;
		for(int i=0; i<chr.length/2; i++)
		{
			char temp = chr[i];
			chr[i]=chr[n-i-1];
			chr[n-i-1] = temp;
		}
		for(Character c : chr)
		{
			revStr = revStr+c;
		}
		System.out.println(revStr);
		if(str.equals(revStr))
		{
			System.out.println("Given String is a palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}
	}
}
