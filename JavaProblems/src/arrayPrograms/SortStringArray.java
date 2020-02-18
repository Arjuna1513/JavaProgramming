package arrayPrograms;

public class SortStringArray 
{
	public static void main(String[] args) 
	{
		String temp = "";
		String[] strArr = new String[5];
		strArr[0]="Apple";strArr[1]="Zebra";strArr[2]="dad";strArr[3]="cat";strArr[4]="brownie";
		for(int i=0; i<strArr.length; i++)
		{
			for(int j=0; j<strArr.length-1; j++)
			{
				if(strArr[j].compareToIgnoreCase(strArr[j+1]) > 0)
				{
					temp = strArr[j];
					strArr[j] = strArr[j+1];
					strArr[j+1] = temp;
				}
			}
		}
		
		for(String s : strArr)
		{
			System.out.println(s);
		}
	}
}
