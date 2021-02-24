package lec4;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		
       printChars(str);
	}
      public static void printChars(String str) {
    	  for(int i=0;i<string.length();i++) {
    		  System.out.println(str.charAt(i));
    	  }
      }
}
