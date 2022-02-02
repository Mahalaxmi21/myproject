package method;

public class Callmethod {
	int val=100;
	
	int opeation(int val) {
		val=val*10/100;
		return (val);
		
	}

	public static void main(String[] args) {
		Callmethod cm = new Callmethod();
		System.out.println("Beffore operation:"+cm.val);
		cm.opeation(5);
		System.out.println("After operation:"+cm.val);

	}

}
