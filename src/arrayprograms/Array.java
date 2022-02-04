package arrayprograms;

public class Array {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 700;
		a[1] = 100;
		a[2] = 200;
		a[3] = 500;
		a[4] = 600;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("------");
		int b[]= {3,5,8,9,2,1};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		

	}

}
