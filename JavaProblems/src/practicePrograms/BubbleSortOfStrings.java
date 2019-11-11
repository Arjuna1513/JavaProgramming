package practicePrograms;

public class BubbleSortOfStrings 
{
	public static void main(String[] args) 
	{
		String[] str = new String[5];
		str[0]="Anakonda";str[1]="Zebra";str[2]="Cat";str[3]="Beer";str[4]="snake";
		for(int i=0; i<str.length; i++)
		{
			for(int j=0; j<str.length-1; j++)
			{
				if(str[j].compareToIgnoreCase(str[j+1]) > 0)
				{
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		
		for(String s : str)
		{
			System.out.println(s);
		}
	}
}
