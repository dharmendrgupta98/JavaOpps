package oops;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="java";
		String s="this is demo";
//		System.out.println(s1+s2);
//		System.out.println(s1+10);
//		System.out.println(s1+10+20);
//		System.out.println(10+20+s1);
//		System.out.println(10+s1+20);
//		System.out.println(10-5+s1);
//	
//		System.out.println(String.join(";", s1,s2,null));
//		System.out.println(s.subSequence(3,9));
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(3, 15));
		System.out.println(s.replace("is","was"));
		System.out.println(s.replaceFirst("is", "was"));
		System.out.println(s.replaceAll("is", "was"));
		System.out.println(s.replace("i","j"));
		System.out.println(s.replaceAll("is(.)", "was"));
		System.out.println(s.replaceAll("is(.*)", "was"));

	}

}
