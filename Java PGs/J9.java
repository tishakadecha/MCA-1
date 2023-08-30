//write a program to create a class and pass name and age as argument and display it.
class Abc
{
	String nm;
	int age;
	void setdata(String a,int b)
	{
		nm=a;
		age=b;
	}
	void disp()
	{
		System.out.println("Name  : "+nm);
		System.out.println("Age  : "+age);
	}
}
class J9
{
	public static void main(String args[])
	{
		System.out.print("Enter Name : ");
		String a = System.console().readLine();
		System.out.print("Enter Age : ");
		int b = Integer.parseInt(System.console().readLine());

		Abc a1 = new Abc();
		a1.setdata(a,b);
		a1.disp();
		
	}
}
