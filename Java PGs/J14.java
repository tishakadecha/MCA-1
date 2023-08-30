//write a program to input 10 Numbers and calculate Total and Average using With Arg With Return Concept.
class Arith
{
	int total(int a[])	
	{
		int tot = 0;
		for (int i = 0; i < a.length; i++)
		{
			tot = tot + a[i];
		}
		return tot;
	}
	double avg(int a[])
	{
		int t = total(a);
		double avg1 = (float)t / a.length;
		return avg1;
	}
}
class J14
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		for(int i = 0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" No : ");
			a[i] = Integer.parseInt(System.console().readLine());
		}

		Arith a1 = new Arith();
		int tot = a1.total(a);
		double avg1 = a1.avg(a);
		System.out.println("Total is : " + tot);
		System.out.println("Average is : " + avg1);
	}
}
