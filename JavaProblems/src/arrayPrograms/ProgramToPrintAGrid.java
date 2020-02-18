package arrayPrograms;

public class ProgramToPrintAGrid 
{
	public static void main(String[] args)
	{
		int[][] a = new int[10][10];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}
