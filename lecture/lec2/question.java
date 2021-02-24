package lec2;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("Upper case");
		}else if(ch>='A'&&ch<='Z') {
			System.out.println("Lower case");
		}else {
			System.out.println("Invalid");
		}
			

	}

}
