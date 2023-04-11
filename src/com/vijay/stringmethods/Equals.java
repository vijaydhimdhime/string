package com.vijay.stringmethods;

public class Equals {
	public static void main(String[] args) {
		String str1 = "solapur";
		String str2 = "solapur";
		String str3 = "SOLAPUR";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
	}
}
