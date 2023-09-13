//Concept of Static Member Variables and Member Methods
class Abc
{
	static int a = 0;
	static void setdata()
	{
		a++;
	}
	static void disp()
	{
		System.out.println("A = "+a);
	}
}
class J35
{
	public static void main(String args[])	
	{
		Abc a1 = new Abc();
		a1.setdata();
		a1.disp();

		Abc a2 = new Abc();
		a2.setdata();
		a2.disp();

		Abc a3 = new Abc();
		a3.setdata();
		a3.disp();
	}
}

 