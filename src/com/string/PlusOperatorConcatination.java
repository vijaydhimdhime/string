package com.string;

public class PlusOperatorConcatination {
	public static void main(String[] args) {
		int day = 2;
		String month = "June";
		int year = 1993;
		String birthDate = day+"nd" +" "+ month +" "+ year;
		System.out.println("birth Date of student : "+birthDate);
		
		String str = "Dhimdhime";
		
		System.out.println(str.substring(2,6));//6 is not part of substring
		String s = "India";
		System.out.println(s.substring(3));
	}

}
