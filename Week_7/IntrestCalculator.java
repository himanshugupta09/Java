import java.io.*;

class IntrestCalaculator
{
	public static void main(String args[])
	{
		Float principalAmount = new Float(0);
		Float rateOfIntrest = new Float(0);
		int numberOfYears = 0;
		

		DataInputStream in = new DataInputStream(System.in);
		String tempString;
		System.out.println("Enter Principal Amount: ");
		System.out.flush();
		
		tempString = in.readLine();
		principalAmount = Float.valueOf(tempString);
		System.out.println("Enter rate of Intrest: ");

		System.out.flush();
		tempString = in.readLine();
		rateOfIntrest = Float.valueOf(tempString);

		
		System.out.println("Enter Number of Years: ");
		System.out.flush();
		tempString = in.readLine();
		numberOfYears  = Integer.parseInt(tempString);


		int intrestTotal = principalAmount*rateOfIntrest*numberOfYears;


		System.out.println("Total Intrest = "+intrestTotal);
	}
}


