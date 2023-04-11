package com.string;

public class CompareRefernces {
	public static void main(String[] args) {
		String str1 = new String("vijay");
		String str2 = new String("kunal");
		String str3 = new String("vijay");
		boolean str = str1 == str2;
		System.out.println("compare refernces : "+str);
		System.out.println("compare content of two strings : "+str1.equals(str3));
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		String name1 = "123";
		String name2 = "123";
		boolean name = name1 == name2;
		System.out.println("compare refernces of name1 and name2 : "+name);
	}
	

}
