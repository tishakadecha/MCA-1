//Area of Circle using No Arg No Ret
class J24
{
	public static double r,pi=3.14,area;
	public static void input()
	{
		System.out.print("Enter Radius = ");
		r = Integer.parseInt(System.console().readLine());
	}
	public static void process()
	{
		area = pi * r * r;
	}
	public static void output()
	{
		System.out.println("Area Of Circle = "+area);
	}
	public static void main(String args[])	
	{	
		System.out.println("No Arg No Ret");
		input();
		process();
		output();
	}
}

