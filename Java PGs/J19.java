//write a program to Calculate Pay Bill by input salary and calculating HRA 10% , Ma = 500rs , TA 7.5% , DA 35% and Find Gross Salary and also Find Net Salary By Deducting PF and IT from Gross salary using N Arg W Ret Pattern..
/*
 PF = If -> sal >= 8000 -> 1000,sal >= 12000 -> 1500,sal >= 18000 -> 1800.
 IT = 10% Of Gross salary
 */
class Bill
{
	double t,h,d,m=500,p,it1,gs1,ns1,sal;
	double input()
	{
		System.out.print( "Enter Salary = ");
		sal = Double.parseDouble(System.console().readLine());
		return sal;	
	}
	double hra()
	{
		return sal * 10/100;
	}
	double ma()
	{
		return 500;
	}
	double ta()
	{
		return sal * 7.5/100;
		
	}
	double da()
	{
		return sal * 35 /100;
	}
	double gs()
	{
		return gs1 = sal + hra() + ta() + ma() + da(); 
	}
	double pf()
	{
		if(sal>=18000)
		{
			return 1800.0;
		}
		else if(sal>=12000)
		{
			return p = 1500.0;
		}
		else
		{
			return p = 1000.0;
		}
	} 
	double it()
	{
		return it1 = gs1 * 10/100;
	}
	double ns()
	{
		return ns1 = gs1 - p - it1;
	}
}
class J19
{
	public static void main(String args[])	
	{	
		double t,h,d,m=500,p,it1,gs1,ns1,sal;

		Bill b1 = new Bill();
		sal = b1.input();
		h = b1.hra();
		t = b1.ta();
		d = b1.da();
		m = b1.ma();
		gs1 = b1.gs();
		p = b1.pf();
		it1 = b1.it();
		ns1 = b1.ns();
		System.out.println(">>> Payable Salary Bill <<<");
		System.out.println("Salary = "+sal);
		System.out.println("HRA = "+h);
		System.out.println("MA = "+m);
		System.out.println("TA = "+t);
		System.out.println("DA = "+d);
		System.out.println("=======================");
		System.out.println("Gross Salary = "+gs1);
		System.out.println("=======================");
		System.out.println("Provident Fund = "+p);
		System.out.println("Income Tax = "+it1);
		System.out.println("=======================");
		System.out.println("Net Salary = "+ns1);
		System.out.println("=======================");
	}
}
