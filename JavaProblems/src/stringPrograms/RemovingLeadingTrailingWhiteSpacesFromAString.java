package stringPrograms;

public class RemovingLeadingTrailingWhiteSpacesFromAString 
{
	public static void main(String[] args) 
	{
		String str =" Hello World! ";
		System.out.println(str.length());
		int fChar=0;
		int lChar=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			else
			{
				fChar=i;
				break;
			}
		}
		str = str.substring(fChar, str.length());
		System.out.println(str);
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			else
			{
				lChar = i;
				break;
			}
		}
		str = str.substring(0,lChar+1);
		System.out.println(str);
		
	}
}
