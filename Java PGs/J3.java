//write an program to input two strings through keyboard using BufferedReader and Display it
import java.io.*;
class J3
{
	public static void main(String args[])throws IOException
	{	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter First Name = ");
		String nm1 = br.readLine();
		System.out.print("Enter Second Name = ");		
		String nm2 = br.readLine();

		System.out.println("First Name = "+nm1);		
		System.out.println("Second Name = "+nm2);		
	}
}