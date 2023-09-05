//Concept of Array
class J32
{
	public static void main(String args[])	
	{
		int tot=0,size;
		double avg;

		System.out.print("Enter  Size Of Array = ");
		size = Integer.parseInt(System.console().readLine());

		int a[] = new int[size];
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Number = ");
			a[i] = Integer.parseInt(System.console().readLine());
			tot = tot + a[i];
		}		
		avg = tot / a.length; // or avg = tot / size;
		for (int i=0;i<a.length;i++)
		{
			System.out.println(i+1+" Number = "+a[i]);
		}
			System.out.println("Total = "+tot);
			System.out.println("Average = "+avg);
	}
}

 