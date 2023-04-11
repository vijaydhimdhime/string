package com.string;

public class Example {
	
	public static void main(String[] args) {
		String s1 = "A java Program";
		String s2="A java Program";
		String s3 = "a java program";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		System.out.println(s1==s2);
		if (s1.equals(s2)) {
			System.out.println("s1 And s2 "+" "+"both strings are equals...");
			
		} else {
			System.out.println("both strings are not equals...");

		}
	}
	
	
}
