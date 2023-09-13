//Concept of Polymorphism -> Method Overloading
class Xyz
{
	void dispdata()
	{
		System.out.println("Disp Data 1st");
	}
	void dispdata(int a)
	{
		System.out.println("Disp Data 2nd:: \nValue Of A = "+a);
	}
	void dispdata(int a, int b)
	{
		System.out.println("Disp Data 3rd:: \nValue Of A = "+a);
		System.out.println("Value Of B = "+b);
	}
	void dispdata(String nm)
	{
		System.out.println("Disp Data 4th:: \nName is = "+nm);
	}
}
class J37
{
	public static void main(String args[])	
	{
		System.out.println("METHOD OVERLOADING ");
		Xyz x1 = new Xyz();
		x1.dispdata();
		x1.dispdata(10);
		x1.dispdata(100,101);
		x1.dispdata("Tisha Kadecha");
	}
}

/*

RULES OF METHOD OVERLOADING
Name of Methods Must Be Same
Arguments Must Be Different either by 
1). type of argument 
2). number of arguments
(.)-> Dot is known as Member Access Operator

 */