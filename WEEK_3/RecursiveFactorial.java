import java.util.*;
import java.lang.*;
public class RecursiveFactorial
{
	int n;	
	
	int factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		RecursiveFactorial x = new RecursiveFactorial();
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + ":" + x.factorial(n));
	}
}