package string_prgm;

public class StringP {

	public static void main(String[] args) {
        System.out.println("Methods of Strings");
		String sl=new String("Hello String");
		System.out.println(sl.length());
		System.out.println("-------------");
		
		//substring
		String sub=new String("Member of String");
		System.out.println(sub.substring(5));
		System.out.println("-------------");
		
		
		//String Comparison
		String s1 = "Hello";
		String s2 = "Hella";//o-a distance b/w 15 so o place a is -14
		System.out.println(s1.compareTo(s2));
		System.out.println("-------------");
		
		//isEmpty
		String s ="";
		String s3 =" ";
		System.out.println(s.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println("-------------");
		
		//toLowerCase
		String s4 = "Hello";
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println("-------------");
		
		//replace
		String s5 = "Hello";
		System.out.println(s5);
		String replace = s5.replace('H', 'A');
		System.out.println(replace);
		System.out.println("-------------");
		
		//Equals
		String a="Core JAva";
		String b="CORE JAVA";
		System.out.println(a.equals(b));
		String i="JAVA";
		String j="JAVA";
		System.out.println(i.equals(j));
		System.out.println("-------------");
		
		
		//Creating StringBuffer and Append methods
		System.out.println("STRING BUFFER");
		StringBuffer SB = new StringBuffer("Simply Learn,");
		SB.append("Enjoy learning");
		System.out.println(SB);
		System.out.println("-------------");
		
		//insert method
		SB.insert(0, 'A');
		System.out.println(SB);
		System.out.println("-------------");
		
		//replace method
		StringBuffer sb = new StringBuffer("Java");
		sb.replace(0, 4, "JAVA");
		System.out.println(sb);
		System.out.println("-------------");
		
		//delete method
		sb.delete(0, 2);
		System.out.println(sb);
		System.out.println("-------------");
		
		//StringBuilder
		StringBuilder Sb = new StringBuilder("Simple learning");
		System.out.println(Sb);
		Sb.append("+");
		System.out.println(Sb);
		Sb.append("Hello");//A char is append the at end
		System.out.println(Sb);
		Sb.append(10);//10 value is append at end 
		System.out.println(Sb);
		Sb.delete(0, 2);//deleting the si string
		System.out.println(Sb);
		Sb.reverse();
		System.out.println(Sb);
		Sb.length();
		
		Sb.reverse();//Conversion of String Object to StringBuilder
		System.out.println("Reverse the String : "+Sb);
		System.out.println("-------------");

		//unicode postion
		String ss = new String("helloooo");
		ss.codePointCount(0, 3);
		System.out.println(ss);
				
		
		 


	}


}
