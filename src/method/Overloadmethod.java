package method;

public class Overloadmethod {
	public void area(int l,int b,int h) {
		System.out.println("Area of Traingle="+(l*b*h));
	}
	public void area(double r) {
		System.out.println("Area of Circle="+(3.14*r*r));
	}
	public void area(int l,int h) {
		System.out.println("Area of reactangle ="+(l*h));
	}
	public void area(int a) {
		System.out.println("Area of square="+(a*a));
	}
	
	public static void main(String[] args) {
		Overloadmethod om = new Overloadmethod();
		om.area(5.2);
		om.area(5);
		om.area(10, 5);
		om.area(5, 5, 5);
	}

}
