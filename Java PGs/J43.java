//Jagged Array means row is fix but Column is not fix 
// Jagged Array must be 2 -D Array.
class J43
{
	public static void main(String args[])	
	{
		int a[][] = new int[3][];
		int n = 1,col;

		for(int i = 0;i<a.length;i++)
		{
			System.out.print("Enter column Size = ");
			col = Integer.parseInt(System.console().readLine());		

			a[i] = new int[col];

			for(int j = 0;j<a[i].length;j++)
			{
				a[i][j] = n++;
			}
		}
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}

