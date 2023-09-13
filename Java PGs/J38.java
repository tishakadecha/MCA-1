//Concept of Polymorphism -> Constructor Overloading
class Xyz
{
	Xyz()
	{
		System.out.println("Disp Data 1st");
	}
	Xyz(int a)
	{
		System.out.println("Disp Data 2nd:: \nValue Of A = "+a);
	}
	Xyz(int a, int b)
	{
		System.out.println("Disp Data 3rd:: \nValue Of A = "+a);
		System.out.println("Value Of B = "+b);
	}
	Xyz(String nm)
	{
		System.out.println("Disp Data 4th:: \nName is = "+nm);
	}
}
class J38
{
	public static void main(String args[])	
	{
		System.out.println("CONSTRUCTOR OVERLOADING ");
		Xyz x1 = new Xyz();
		Xyz x2 = new Xyz(10);
		Xyz x3 = new Xyz(100,101);
		Xyz x4 = new Xyz("Tisha Kadecha");
	}
}

