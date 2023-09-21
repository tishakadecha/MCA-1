// Multiple Inheritance
interface A
{
	void setdata();
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
}
class J49
{
	public static void main(String args[])	
	{
		C c1 = new C();
		c1.dispB();
		c1.dispC();
		c1.setdata();
	}
}

