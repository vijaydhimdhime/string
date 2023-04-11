package com.string;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME : ");
		String firstName = sc.nextLine();
		System.out.println("ENTER THE LAST NAME : ");
		String lastName = sc.nextLine();
		System.out.println(firstName + " "+lastName);
		System.out.println(lastName.length());
		System.out.println(lastName.charAt(5));
		for(int i=0;i<firstName.length();i++){
			System.out.print(firstName.charAt(i));
		}
		
	}
}
