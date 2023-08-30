//Area of Circle using With Arg With Ret
class J27
{
	public static double process(double r)
	{
		double pi=3.14,area;
		area = pi * r * r;
		return area;
	}
	public static void main(String args[])	
	{
		double r;
		System.out.println("With Arg With Ret");
		System.out.print("Enter Radius = ");
		r = Double.parseDouble(System.console().readLine());
		
		System.out.println("Area Of Circle = "+process(r));
	}
}

