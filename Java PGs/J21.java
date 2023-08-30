//Example of differnt types of Constructor
class Abc
{
	Abc()
	{
		System.out.println("Non Parameterized Constructor");//1st Priority to default constructor(non parameterize)
	}
	Abc(String str)
	{
		System.out.println(str);//next Priority to default constructor(parameterize)	
	}
}
class J21
{
	public static void main(String args[])	
	{	
		Abc a1 = new Abc();
		Abc a2 = new Abc("Parameterized Constructor");
	}
}
