package simplylearn;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number  :  ");
		n1=sc.nextInt();
		System.out.println("Enter the Second Number : ");
		n2=sc.nextInt();

		System.out.println("opeartion are perfroming");
		System.out.println("Addition :"+ (n1+n2));
		System.out.println("Substrction :"+ (n1-n2));
		System.out.println("Multiplication :"+ (n1*n2));
		System.out.println("Division :"+ (n1/n2));
		System.out.println("N1 Grater Than N2 :"+ (n1>n2));
		System.out.println("N1 Grater Than equal to N2 :"+ (n1>=n2));
		System.out.println("N1 is less than N2 :"+ (n1<n2));
		if(n1==n2) {
			System.out.println("N1 is equal to N2");

		}else {
			System.out.println("N1 is not equal to N2");
		}

	}

}
