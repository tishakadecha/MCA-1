//Concept of Switch Case with char
class J29
{
	public static void main(String args[])	
	{
		int no1,no2,ans=0;
		char ch;
		System.out.print("Enter 1st Number = ");
		no1 = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 2nd Number = ");
		no2 = Integer.parseInt(System.console().readLine());

		System.out.println(":: ARITHMETIC OPERATIONS ::");
		System.out.println("+ Addition");
		System.out.println("- Subtraction");
		System.out.println("* Multiplication");
		System.out.println("/ Division");

		System.out.print("Enter Your Choice = ");
		ch = System.console().readLine().charAt(0);

		switch(ch) 
		{
			case '+':
				ans = no1 + no2;
				break;
			case '-':
				ans = no1 - no2;
				break;
			default:
				System.out.println("Wrong Choice Plese Try Again");
				break;
			case '*':
				ans = no1 * no2;
				break;
			case '/':
				ans = no1 / no2;
				break;
		}
		System.out.println("Answer is = "+ans);
	}
}

