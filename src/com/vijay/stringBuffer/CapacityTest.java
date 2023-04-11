package com.vijay.stringBuffer;

public class CapacityTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		int length = sb.length();
		int capacity = sb.capacity();
		System.out.println("default size and length");
		System.out.println("length: "+length);
		System.out.println("capacity: "+capacity);
		System.out.println("after adding 16 charactors....");
		sb.append("asdfghjklzxcvbnmq");
		
		
		System.out.println("length: "+sb.length());
		System.out.println("capacity: "+sb.capacity());
		sb.append("asdfghjklasdfghjkw");
		System.out.println("length: "+sb.length());
		System.out.println("capacity: "+sb.capacity());
	}
}
