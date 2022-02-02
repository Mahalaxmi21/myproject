package method;

public class Method1 {
	public int multinumber(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {
		Method1 m = new Method1();
		int ans= m.multinumber(10, 5);
		System.out.println("Multiplication of A & B="+ans);

	}

}
