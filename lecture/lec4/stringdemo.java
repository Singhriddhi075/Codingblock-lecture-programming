package lec4;

import java.util.Scanner;

public class stringdemo {

	public static void main(String[] args) {
		String str="hello";
//		String str1="hello";
//		str1="bye";
////		System.out.println(str);
//		String s=new String("abc");
//		String s1=new String("abc");
//		System.out.println(s);
//		s=str;
//		System.out.println(s1);
//		Scanner scn=new Scanner(System.in);
//		String s3=scn.next();
//		System.out.println(s3);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.length());
		System.out.println(str.substring(1,4));
		System.out.println(str.substring(1));
//		concatanation
		String s1="hi";
		String s2="bye";
		String s3=s1+s2;
		System.out.println(s1+","+s2","+s3);
		String s4=s1.cocat(s2);
		System.out.println(s1+","+s2+","+s4);
//		Indexof
		System.out.println(str.indexOf('e'));
//		StartsWith
//		E

	}

} 
