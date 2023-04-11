package com.vijay.stringBuilder;

public class Demo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");//stringBuffer & Builder contain reverse() method 
		System.out.println(sb.reverse());
		StringBuffer sb1 = new StringBuffer("12345");
		System.out.println(sb1.reverse());
		String str = new String("987456321");// string method does not exist reverse() method 
		System.out.println(str);
	}
}
