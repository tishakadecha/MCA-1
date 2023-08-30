//Simple interrest using No Arg No Ret
class SI
{
	void si()
	{
		double p,r,n,si;
		System.out.print("Enter Amount = ");
		p = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Rate = ");
		r = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Year = ");
		n = Integer.parseInt(System.console().readLine());

		si = p*r*n/100;

		System.out.println("Simple Interest = "+si);
	}
}
class J22
{
	public static void main(String args[])	
	{	
		SI s = new SI();
		s.si();
	}
}

