package com.vijay.stringBufferClass;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.append("Welcome "));
		System.out.println(sb.append("to "));
		System.out.println(sb.append("java"));
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("hello");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	}

}