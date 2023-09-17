//3-D Array

class J42
{
	public static void main(String args[])	
	{
		int a[][][] = new int[3][2][3];
		int n = 1;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				for(int k = 0;k<a[i][j].length;k++)
				{
					a[i][j][k] = n++;
				}
			}
		}
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				for(int k = 0;k<a[i][j].length;k++)
				{
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

