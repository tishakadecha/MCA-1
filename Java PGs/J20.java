//Example of Parameterize Construct
/*static value intialization
class Abc
{
	int a=10,b=20;
	void disp()
	{
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}

}
class J20
{
	public static void main(String args[])	
	{	
		Abc a1 = new Abc();
		Abc a2 = new Abc();
		Abc a3 = new Abc();
		a1.disp();
		a2.disp();
		a3.disp();
	}
}
 */
//1.Constructor always be public *MUST* 
//2.Same as Class Name 
//3.Two Types 1> Default , 2> Parameterized 
//4.Constructor does not have any return type.
//5.Automatically called when new object is created. we can not call explicitly.
//6.One Class can have multiple Constructors
//7.First Priority is non parameterized and next priority parameterized constructor
//8.More than One constructor call constructor overloading
class Abc
{
	int a=10,b=20;
	Abc(int i,int j)
	{
		a = i;
		b = j;
	}
	void disp()
	{
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}

}
class J20
{
	public static void main(String args[])	
	{	
		Abc a1 = new Abc(10,20);
		Abc a2 = new Abc(999,888);
		Abc a3 = new Abc(111,222);
		a1.disp();
		a2.disp();
		a3.disp();
	}
}