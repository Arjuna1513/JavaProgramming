package practicePrograms;

import java.util.Scanner;

public class DisplayOnlyDiagonalEelementsInAMatrix 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter positive and equal size values for x, y");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int[][] matrix = new int[x][y];
		System.out.println("Enter the "+x * y+" values for 2D array");
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				if(i==j)
				{
//					System.out.print("* ");
					System.out.print(matrix[i][j]+"  ");
				}
				else if(i+j == x-1)
				{
//					System.out.print("* ");
					System.out.print(matrix[i][j]+"  ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*System.out.println("Displaying elements in a  matrix");
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}*/
	}
}
