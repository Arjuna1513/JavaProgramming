package practicePrograms;

public class FindPatternOccurancesInAString 
{
	public static void main(String[] args) 
	{
		String searchPat = "z";
		String str = "zazbzczd".toUpperCase();
//		str = str.replaceAll(searchPat, searchPat.toUpperCase());
		searchPat = searchPat.toUpperCase();
		
		String[] strArr = str.split(searchPat);
		for(String s : strArr)
		{
			System.out.println(s);
		}
		if(!str.endsWith(searchPat))
		{
			int strLen = strArr.length-1;
			System.out.println("Occurances of given pattern in a string when str ends with pattern :"+ strLen);
		}
		else
		{
			int strLen = strArr.length;
			System.out.println("Occurances of given pattern in a string when str does not ends with pattern "+ strLen);
		}
		
	}
}
