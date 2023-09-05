//Area of Circle using With Arg With Ret
class J28
{
	public static void main(String args[])	
	{
		int ch,no1,no2,ans=0;

		System.out.print("Enter 1st Number = ");
		no1 = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 2nd Number = ");
		no2 = Integer.parseInt(System.console().readLine());

		System.out.println(":: ARITHMETIC OPERATIONS ::");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		System.out.print("Enter Your Choice = ");
		ch = Integer.parseInt(System.console().readLine());

		switch(ch) 
		{
			case 1:
				ans = no1 + no2;
				break;
			case 2:
				ans = no1 - no2;
				break;
			default:
				System.out.println("Wrong Choice Plese Try Again");
				break;
			case 3:
				ans = no1 * no2;
				break;
			case 4:
				ans = no1 / no2;
				break;
		}
		System.out.println("Answer is = "+ans);
	}
}

