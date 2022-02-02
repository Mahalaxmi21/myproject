package constractors;

public class Constctor {
	String brand,color;
	int prize;
	
	Constctor() { //custom constructor
		System.out.println("Mobile Details");
		brand = "iphone";
		color= "Red";
		prize =500000;	
	}

	public static void main(String[] args) {
		String s ="Hello";
		System.out.println(s.hashCode());
		Constctor mb = new Constctor();
		System.out.println(mb.brand+" "+mb.color+" "+mb.prize);
		
	}

}
