package com.vijay.stringmethods;

public class ReverseString {
	public static void main(String[] args) {
		String str = "121";
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--){
			reverse = reverse + str.charAt(i);
		}
		//System.out.println(reverse);
		System.out.println("original string is --> "+str);
		 if(str.equalsIgnoreCase(reverse))
	           System.out.println("String " +str+ " is palindrome.");
	     else
	          System. out.println("String " +str+ " is not palindrome.");
	}
}
