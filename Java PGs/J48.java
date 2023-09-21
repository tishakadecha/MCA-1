// Interface
interface A
{
	void setdata();
}
class B implements A
{
	void dispB()
	{
		System.out.println("Class - B");
	}
	public void setdata()
	{
		System.out.println("Interface A Set Data Method");
	}
}
class J48
{
	public static void main(String args[])	
	{
		B b1 = new B();
		b1.dispB();
		b1.setdata();
	}
}

