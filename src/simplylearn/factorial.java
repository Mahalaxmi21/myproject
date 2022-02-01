package simplylearn;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// Finding the factorial number
		// 3! = 1 * 2 * 3 = 6 is a factorial of 3;
		// 5! = 1 * 2 * 3 * 4 * 5 = 120;

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Factrial number:");
		n=sc.nextInt();

		int Fact_var=1;
		for(int i = 1; i<=n; i++) 
		{
			Fact_var=Fact_var*i;
		}
		System.out.print("Factorial number "+n+" is= "+Fact_var);

	}

}
