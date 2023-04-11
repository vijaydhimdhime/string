package com.vijay.stringmethods;

public class StratWith {
	public static void main(String[] args) {
		String name = "my name is ram";
		System.out.println(name.startsWith("my"));
		System.out.println(name.startsWith("my name"));
		System.out.println(name.startsWith("name"));
		System.out.println(name.endsWith("ram"));
		System.out.println(name.startsWith("is"));
		System.out.println(name.indexOf("n"));
		System.out.println(name.lastIndexOf("r"));
	}

}
