package lec4;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
          substring("riddhi");
	}
	public static void substring(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
