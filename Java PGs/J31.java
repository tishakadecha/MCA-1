//Concept of Array
class J31
{
	public static void main(String args[])	
	{
		int a[] = new int[10];
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Number = ");
			a[i] = Integer.parseInt(System.console().readLine());
		}		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(i+1+" Number = "+a[i]);
		}
	}
}

 