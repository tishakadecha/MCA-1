//write an program to input Student Name,Age and City Through keyboard using BufferedReader and Display it
import java.io.*;
class J4
{
	public static void main(String args[])throws IOException
	{	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter Student Name = ");
		String nm1 = br.readLine();
		System.out.print("Enter Student Age = ");		
		String nm2 = br.readLine();
		System.out.print("Enter Student City = ");		
		String nm3 = br.readLine();

		System.out.println("Student Name = "+nm1);		
		System.out.println("Student Age = "+nm2);		
		System.out.println("Student City = "+nm3);		
	}
}