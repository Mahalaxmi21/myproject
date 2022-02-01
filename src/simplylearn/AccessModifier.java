package simplylearn;

public class AccessModifier {
	final int x = 10;
	final double PI = 3.14;//when using final where were constant values is there then use the capital of the value. 

	public static void main(String[] args) {
		System.out.println("Access Modifiers");
		
		AccessModifier AM = new AccessModifier();
		
		System.out.println(AM.x);
		System.out.println(AM.PI);
		
		
		
		
		

	}

}
