package stringPrograms;

public class AtringAnagram 
{
	public static void main(String[] args) 
	{
		String str = "LISTEN";
		String str2 = "SILENT";
		int fCount = 0;
		int sCount = 0;
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		for(int i=0; i<str.length(); i++)
		{
			fCount = fCount + str.charAt(i);
		}
		for(int i=0; i<str2.length(); i++)
		{
			sCount = sCount + str2.charAt(i);
		}
		if(fCount==sCount)
		{
			System.out.println("Given Strings Are Anagrams Of Each Other");
		}
		else
		{
			System.out.println("Given Strings Are Not Anagrams");
		}
	}
}
