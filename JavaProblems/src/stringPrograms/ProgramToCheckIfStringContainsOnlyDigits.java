package stringPrograms;

public class ProgramToCheckIfStringContainsOnlyDigits 
{
	public static void main(String[] args) 
	{
		String s1 = "55b098999999";
		for(int i=0; i<s1.length(); i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				continue;
			}
			else
			{
				System.out.println("String contains chars other than digits");
				System.exit(0);
			}
		}
		System.out.println("String contains only digits");
	}
}
