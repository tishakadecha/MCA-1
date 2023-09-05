//Concept of Array
class J33
{
	public static void main(String args[])	
	{
		int tot=0;
		double avg;

		int a[] = {10,20,30,40,50};

		for (int i=0;i<a.length;i++)
		{
			System.out.println(i+1+" Number = "+a[i]);
			tot = tot + a[i];
		}
		avg = tot / a.length;

		System.out.println("Total = "+tot);
		System.out.println("Average = "+avg);
	}
}

 