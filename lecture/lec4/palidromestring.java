package lec4;

import java.util.Scanner;

public class palidromestring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ispalidrome(str);

	}

	public static boolean ispalidrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		
			
	}
	return true;
  }
}