package com.string;

public class MyString {
	public static void main(String[] args) {
		String s = "Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello java!!!");
		String s3  = new String("Hello world");
		String s4  = "Hello java!!!";
		String s5 = "Hello";
		System.out.println(s==s5);
		System.out.println(s2==s4);
	}
}
