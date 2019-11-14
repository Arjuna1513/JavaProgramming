package stringPrograms;
import java.util.HashMap;
import java.util.Map;

public class FindingUniqueCharactersInAnArray 
{
	public static void main(String[] args) 
	{
		String str = "MallikarliM";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<str.length(); i++)
		{
			int chrCount = 0;
			char c = str.charAt(i);
			for(int j=0; j<str.length(); j++)
			{
				if(str.charAt(j)==c)
				{
					chrCount++;
				}
			}
			if(chrCount == 1)
			{
				map.put(c, chrCount);
			}
//			else
//			{
//				map.put(c, chrCount);
//			}
		}
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
