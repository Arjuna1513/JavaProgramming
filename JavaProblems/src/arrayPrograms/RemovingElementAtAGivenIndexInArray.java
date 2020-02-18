package arrayPrograms;

public class RemovingElementAtAGivenIndexInArray 
{
	public static void main(String[] args) 
	{
		int[] ar1 = new int[5];
		int index = 2;
		int x=100;
		for(int i=0; i<5; i++)
		{
			ar1[i] = x;
			x += 100;
		}
		
		System.out.println("List of elements before performing deletion");
		for(Integer i : ar1)
		{
			System.out.println(i);
		}
		
		int[] ar2 = new int[4];
		int j=0;
		for(int i=0; i<ar1.length; i++)
		{
			if(i != index)
			{
				ar2[j] = ar1[i];
				j++;
			}
		}
		System.out.println("List of elements after deleting element from given index");
		for(Integer i : ar2)
		{
			System.out.println(i);
		}
	}
}
