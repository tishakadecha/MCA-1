//Single Inheritance
class A
{
	void dispA()
	{
		System.out.println("Class A");
	}	
}
class B extends A
{
	void dispB()
	{
		System.out.println("Class B");
	}	
}
class J39
{
	public static void main(String args[])	
	{
		B b1 = new B();
		b1.dispA();
		b1.dispB();

	}
}

