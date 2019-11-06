package practicePrograms;

import java.util.Scanner;

public class MatrixDiagonalAbsoluteDifference 
{
	public static void main(String[] args) 
	{
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		int[][] matrix = null;
		int x = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the x, y values for 2 dimesional array of equal sizes");
		
			while(true)
			{
				try
				{
					x = scan.nextInt();
					y = scan.nextInt();
					if(x >= 2 && y >= 2 && x == y)
					{
						int count = 0;
						matrix =  new int[x][y];
						System.out.println("Enter the "+x * y+" values for 2D array");
						
							for(int i=0; i<x; i++)
							{
								for(int j=0; j<y; j++)
								{
									matrix[i][j] = scan.nextInt();
									count++;
								}
							}
							if(count == x*y)
							{
								for(int i=0; i<x; i++)
								{
									for(int j=0; j<y; j++)
									{
										if(i==j)
										{
											diagonalSum1 = diagonalSum1 + matrix[i][j];
										}
										if(i+j == x-1)
										{
											System.out.println(i+j);
											diagonalSum2 = diagonalSum2 + matrix[i][j];
										}
									}
								}
								System.out.println(diagonalSum1);
								System.out.println(diagonalSum2);
								break;
							}
							else
							{
								System.out.println(x*y +"values are not enetered");
//								break;
							}
						}
					else
					{
						System.out.println("Enter x,y positive integers of size same length");
//						break;
					}
				}
				catch(Exception e)
				{
					System.out.println("Enter integer values and try again");
				}
		}
			
	}
}
