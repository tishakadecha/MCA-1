//write a program to Calculate Pay Bill by input salary and calculating HRA 10% , Ma = 500rs , TA 7.5% , DA 35% and Find Gross Salary and also Find Net Salary By Deducting PF and IT from Gross salary using W Arg N Ret Pattern..
/*
 PF = If -> sal >= 8000 -> 1000,sal >= 12000 -> 1500,sal >= 18000 -> 1800.
 IT = 10% Of Gross salary
 */
class Bill
{
	double t,h,d,m=500,p,it1,gs1,ns1;
	void salCal(double sal)
	{
		h = sal * 10/100;
		t = sal * 7.5/100;
		d = sal * 35 /100;
		gs1 = sal + h + t + m + d; 
		if(sal>=18000)
		{
			p = 1800.0;
		}
		else if(sal>=12000)
		{
			p = 1500.0;
		}
		else
		{
			p = 1000.0;
		}
		it1 = gs1 * 10/100;
		ns1 = gs1 - p - it1;
	}
	void output(double sal)
	{
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
	// OR
	/* void salCal(double sal)
	{
		double t,h,d,m=500,p,it1,gs1,ns1;
		h = sal * 10/100;
		t = sal * 7.5/100;
		d = sal * 35 /100;
		gs1 = sal + h + t + m + d; 
		if(sal>=18000)
		{
			p = 1800.0;
		}
		else if(sal>=12000)
		{
			p = 1500.0;
		}
		else
		{
			p = 1000.0;
		}
		it1 = gs1 * 10/100;
		ns1 = gs1 - p - it1;

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
	} */
}
class J18
{
	public static void main(String args[])	
	{	
		double sal;
		System.out.print( "Enter Salary = ");
		sal = Double.parseDouble(System.console().readLine());

		Bill b1 = new Bill();
		b1.salCal(sal);
		b1.output(sal);
	}
}
