//Area of Circle using No Arg With Ret
class J26
{
	public static double input()
	{
		double r;
		System.out.print("Enter Radius = ");
		r = Double.parseDouble(System.console().readLine());
		return r;
	}
	public static double process()
	{
		double pi=3.14,area,r;
		r = input();
		area = pi * r * r;
		return area;
	}
	public static void main(String args[])	
	{	
		System.out.println("No Arg With Ret");
		System.out.println("Area Of Circle = "+process());
	}
}

