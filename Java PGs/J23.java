//Simple interrest using With Arg With Ret
class SI
{
	double si(double p,double r,double n)
	{
		return p*r*n/100;
	}
}
class J23
{
	public static void main(String args[])	
	{	
		double p,r,n,s1;
		System.out.print("Enter Amount = ");
		p = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Rate = ");
		r = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Year = ");
		n = Integer.parseInt(System.console().readLine());

		SI s = new SI();
		s1 = s.si(p,r,n);

		System.out.println("Simple Interest = "+s1);
	}
}

