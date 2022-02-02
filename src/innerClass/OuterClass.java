package innerClass;

class OuterClass {
	private String str ="Inner Class";
	
	class Inner{
		void msg() 
		{
			System.out.println("Programm Name, "+str);
		}
	}
		void display() {
			Inner in = new Inner();
			in.msg();
		}
	
	  public static void main(String[] args) {
		 OuterClass oc = new OuterClass();
		 oc.display();
		
	}
}
