package stringPrograms;

import java.util.Arrays;

public class ConvertingStringToAnArray 
{
	public static void main(String[] args) 
	{
		int[] array = new int[5];
		array[0] = 100;array[1]=200;array[2]=300;array[3]=400;array[4]=500;
		System.out.println(array);
		String convertedValue = Arrays.toString(array);
		System.out.println(convertedValue);
		char[] cr = convertedValue.toCharArray();
		for(Character c : cr)
		{
			System.out.println(c);
		}
	}
	//when array is converted to String exact array representation will be converted to String
	// ex : 100,200,300,400,500 were elements of array and it's string represnation is
	//[100, 200, 300, 400, 500]
}
