import java.util.*;
public class SimpleFibbonacci {
	
	int n;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int fib1 = 0,fib2 = 1;
		System.out.println(fib1 + "\n" + fib2);
	
		while(fib2 < n){
			int fibo = fib1 + fib2;
			System.out.println(" " + fibo);
			fib1 = fib2;
			fib2 = fibo;
			n++;
		}
	}	
}
	
	

