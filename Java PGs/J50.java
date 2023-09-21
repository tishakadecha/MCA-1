// Interface Inheritance - Interface can be extended
interface A
{
	void setdata();
}
interface A1 extends A
{
	void dispdata();
}
class B 
{
	void dispB()
	{
		System.out.println("Class - B");
	}
}
class C extends B implements A
{
	void dispC()
	{
		System.out.println("Class - C");
	}
	public void setdata()
	{
		System.out.println("Interface A Set Data Method");
	}
	public void dispdata()
	{
		System.out.println("Interface A1 Disp Data Method");
	}
}
class J50
{
	public static void main(String args[])	
	{
		C c1 = new C();
		c1.dispB();
		c1.dispC();
		c1.setdata();
		c1.dispdata();
	}
}

