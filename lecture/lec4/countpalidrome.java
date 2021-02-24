package lec4;

import java.util.Scanner;

public class countpalidrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(countpalidromesubstring("nitinn"));
		

	}
    public static int countpalidromesubstring(String str) {
    	int count=0;
    	for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<=string.length();j++) {
				String S1=System.out.println(str.substring(i,j));
			}if(ispalidrome(s1)) {
				count++;
			}
		}
     
    }
    return count;
}
