//Area of Circle using With Arg No Ret
class J25
{
	public static void process(double r)
	{
		double pi=3.14,area;
		area = pi * r * r;
		System.out.println("Area Of Circle = "+area);
	}
	public static void main(String args[])	
	{	
		double r;
		System.out.println("With Arg No Ret");
		System.out.print("Enter Radius = ");
		r = Double.parseDouble(System.console().readLine());
		process(r);
	}
}

