package simplylearn;

public class StaticMethod_PublicMethod {
	static void mystaticmethod() {
		System.out.println("Static Method");
	}
	
	public void PublicMethod() {
		System.out.println("Public Method");
	}

	public static void main(String[] args) {
		mystaticmethod();
		StaticMethod_PublicMethod sm = new StaticMethod_PublicMethod();
		sm.PublicMethod();
	}

}
