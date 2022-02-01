package simplylearn;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Widening casting done by Autometically// Automatic casting: int to double //");
		int myInt = 9;
	    double myDouble = myInt; 

	    System.out.println(myInt);
	    System.out.println(myDouble);
	    
	    System.out.println("Narrowing casting manully placing type of data// Automatic casting : double to int //");
	    double mydouble = 13.5656;
	    int myint = (int) mydouble;
	    
	    System.out.println(mydouble);
	    System.out.println(myint);
	    
	    System.out.println("//Automatic casting : string to int//");
	    String S = "200";
	    int I = Integer.parseInt(S);
	    
	    System.out.println(S);
	    System.out.println(I);
	}

}
