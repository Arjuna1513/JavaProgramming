package stringPrograms;

public class StringShuffle 
{
	public static void main(String[] args) 
	{
		String s1 = "ABCDE";
		String s2 = "123";
		String newStr="";
		int len1 = s1.length();
		int len2 = s2.length();
		
		String remStr = "";
		if(len1 > len2)
		{
			remStr = s1.substring(len2);
		}
		else if(len2 > len1)
		{
			remStr = s2.substring(len1);
		}
		
		int i=0;
		int j=0;
		int length = 0;
		while(length < (len1 + len2 - remStr.length()))
		{
			newStr = newStr + s1.charAt(i) + s2.charAt(i);
			i++;
			j++;
			length += 2;
		}
		
		newStr = newStr + remStr;
		System.out.println(newStr);
	}
}
