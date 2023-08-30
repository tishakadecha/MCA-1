//write a program to Calculate Pay Bill by input salary and calculating HRA 10% , Ma = 500rs , TA 7.5% , DA 35% and Find Gross Salary and also Find Net Salary By Deducting PF and IT from Gross salary using W Arg W Ret Pattern..
/*
 PF = If -> sal >= 8000 -> 1000,sal >= 12000 -> 1500,sal >= 18000 -> 1800.
 IT = 10% Of Gross salary
 */
class Bill
{
	double t,h,d,m=500,p,it1,gs1,ns1;
	
	double hra(double sal)
	{
		return h = sal * 10/100;
	}
	double ma()
	{
		return m;
	}
	double ta(double sal)
	{
		return t = sal * 7.5/100;
		
	}
	double da(double sal)
	{
		return d = sal * 35 /100;
	}
	double gs(double sal)
	{
		return gs1 = sal + h + t + m + d; 
	}
	double pf(double sal)
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
 class J16
{
	public static void main(String args[])	
	{
		double sal,h,t,d,m,gs1,pf1,it1,ns1;;
		System.out.print( "Enter Salary = ");
		sal = Double.parseDouble(System.console().readLine());
		Bill b1 = new Bill();
		h = b1.hra(sal);
		t = (int)b1.ta(sal);
		d = b1.da(sal);
		m = b1.ma();
		gs1 = b1.gs(sal);
		pf1 = b1.pf(sal);
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
		System.out.println("Provident Fund = "+pf1);
		System.out.println("Income Tax = "+it1);
		System.out.println("=======================");
		System.out.println("Net Salary = "+ns1);
		System.out.println("=======================");
	}
}
