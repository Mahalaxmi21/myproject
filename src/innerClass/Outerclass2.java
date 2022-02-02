package innerClass;

public class Outerclass2 {
	private int i=30;
	
	class Inner{
		void msg() {
			System.out.println("Integer number is :"+i);
		}
	}
	void dispay() {
		Inner in = new Inner();
		in.msg();
	}

	public static void main(String[] args) {
		Outerclass2 O = new Outerclass2();
		O.dispay();
		
	}

}
