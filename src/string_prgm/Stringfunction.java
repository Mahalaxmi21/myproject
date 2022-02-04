package string_prgm;

public class Stringfunction {

	public static void main(String[] args) {
		String s = "Simply Learning";
		String s2 = "Simply Learning Programming";
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.codePointAt(3));
		
		System.out.println(s.codePointBefore(2));
		
		System.out.println(s.codePointCount(0, 5));
		
		System.out.println(s.compareToIgnoreCase(s2));
		
		System.out.println(s.concat(s2));
		
		String s3 = "Simply Learning";
		String s4 = "Simply Learning";
		System.out.println(s3.contains(s4));
		
		String s31 = "Simply Learning";
		String s41 = "Simply Learning";
		System.out.println(s31.contentEquals(s41));
		
		System.out.println(s.endsWith(s2));
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.equalsIgnoreCase(s));
		
		System.out.println(s.hashCode());
		
		System.out.println(s.indexOf('i'));
		
		System.out.println(s.indexOf("e"));
		
		System.out.println(s.length());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.lastIndexOf('g'));
		
		System.out.println(s.lastIndexOf("ing"));
		
		System.out.println(s2.length());
		
		System.out.println(s.matches(s41));
		
		System.out.println(s.replace('S', 'A'));
		
		System.out.println(s.replaceAll(s31, s2));
		
		System.out.println(s.toCharArray());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.trim());
		
		System.out.println(s.getBytes());
		
		System.out.println(s.split(s2));
		
		System.out.println(s.format(s41, s2));
		
		System.out.println(s.valueOf(true));
		
		System.out.println(s.valueOf('S'));

	}

}
