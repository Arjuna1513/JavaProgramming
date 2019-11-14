package stringPrograms;

public class RemoveOccurancesOfACharacterFromAStringUsingInBuiltFunction 
{
	public static void main(String[] args) 
	{

		String str = "Mallikarjuna";
		char c = 'l';
//		String s = "";
//		s = s+c;
		str = str.replaceAll(String.valueOf(c),"");
		System.out.println("New string after removing character "+c+" from string is : "+str);
	}
	
}
