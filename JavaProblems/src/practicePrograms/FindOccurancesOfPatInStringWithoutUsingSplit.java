package practicePrograms;

public class FindOccurancesOfPatInStringWithoutUsingSplit 
{
	public static void main(String[] args) 
	{
		String str = "a1xb1xc1xd1xe1".toUpperCase();
		int count = 0;
		String pat = "x".toUpperCase();
		int index = 0;
		while((index = str.indexOf(pat, index)) != -1)
		{
			count++;
			index++;
		}
		System.out.println(count);
	}
}
