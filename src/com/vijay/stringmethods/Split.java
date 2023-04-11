package com.vijay.stringmethods;

public class Split {public static void main(String[] args)
{
	 String str = "I love Java Technology";
	 String[ ] s;
	       s = str.split(" ");
	  int length = str.length();
	  for(int i = 0;  i < length; i++) {
		  System.out.println(s[i]);
	    }
	 } 

}
