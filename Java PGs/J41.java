//2-D Array

class J41
{
	public static void main(String args[])	
	{
		int a[][] = new int[3][2];
		int n = 1;
		for(int i = 0;i<a.length;i++)
		{
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

