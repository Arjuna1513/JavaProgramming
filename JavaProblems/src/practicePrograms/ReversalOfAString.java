package practicePrograms;

public class ReversalOfAString 
{
	public static void main(String[] args) 
	{
		String str = "Malli";
		String revStr = "";
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			revStr = revStr + str.charAt(i);
		}
		System.out.println("Reverse string value "+ revStr);
	}
}
