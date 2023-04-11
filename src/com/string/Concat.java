package com.string;

public class Concat {
public static void main(String[] args) {
	String name ="hello";
	String str = "hello";
	String name1=name.concat("world");
//	System.out.println(name1);
//	System.out.println("object refernce : "+name == name1);
//	System.out.println("object refernce : "+name == str);
//	System.out.println("object content : "+name.equals(str));
	String str1 = new String("Mr. Vijay");
	String str2 = new String("Uttareshwar");
	String str3 = new String("Dhimdhime");
	 System.out.println(str1.concat(" "+str2).concat(" "+str3));
//	
//	System.out.println(str1.equals(str2));
//	System.out.println(str.equals("helLo"));
//	System.out.println(str.equalsIgnoreCase("helLo"));
	 String s1 = "ABC" + 'D';
	 System.out.println(s1);
	}
}

