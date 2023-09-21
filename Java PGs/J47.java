// Hirarchical Inheritance - 2
class Student
{
	int rno,cno;
	String name,city;
	void set_studinfo()
	{
		System.out.print("\nEnter Rno = ");
		rno = Integer.parseInt(System.console().readLine());

		System.out.print("Enter Name = ");
		name = System.console().readLine();

		System.out.print("Enter City = ");
		city = System.console().readLine();

		System.out.print("Enter Contact = ");
		cno = Integer.parseInt(System.console().readLine());
	}
	void disp_studinfo()
	{
		System.out.println("\n==+: Student Information :+==");
		System.out.println("Roll No = "+rno);
		System.out.println("Name = "+name);
		System.out.println("City = "+city);
		System.out.println("Contact = "+cno);
	}
}
class Exam extends Student
{
	int totm,obtain_m;
	String sub,res;
	void set_exam()
	{
		System.out.print("Enter Subject = ");
		sub = System.console().readLine();

		System.out.print("Enter Total Marks = ");
		totm = Integer.parseInt(System.console().readLine());

		System.out.print("Enter Obtain Marks = ");
		obtain_m = Integer.parseInt(System.console().readLine());

		System.out.print("Enter Result = ");
		res = System.console().readLine();
	}
	void disp_examinfo()
	{
		System.out.println("\n==+: Exam Information :+==");
		System.out.println("Roll No = "+rno);
		System.out.println("Subject = "+sub);
		System.out.println("Total Marks = "+totm);
		System.out.println("Obtain Marks = "+obtain_m);
		System.out.println("Exam Result = "+res);
	}
}
class Sports extends Student
{
	String game,res,ach;
	void set_sinfo()
	{
		System.out.print("Enter game = ");
		game = System.console().readLine();

		System.out.print("Enter Result = ");
		res = System.console().readLine();

		System.out.print("Enter Achivement = ");
		ach = System.console().readLine();
	}
	void disp_sinfo()
	{
		System.out.println("\n==+: Sports Information :+==");
		System.out.println("Roll No = "+rno);
		System.out.println("Game = "+game);
		System.out.println("Sports Result = "+res);
		System.out.println("Achievement = "+ach);
	}
}
class J47
{
	public static void main(String args[])	
	{
		Exam e1 = new Exam();
		e1.set_studinfo();
		e1.set_exam();

		e1.disp_studinfo();
		e1.disp_examinfo();

		Sports s1 = new Sports();
		s1.set_studinfo();
		s1.set_sinfo();

		s1.disp_studinfo();
		s1.disp_sinfo();
	}
}

