package lec4;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
         System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		String ans="";
		
		while(true) {
			
			int idx=str.lastIndexOf(' ');
			String word=str.substring(idx+1,str.length());
			ans+=word+" ";
			
			if(idx==-1) {
				break;
			}else {
				str=str.substring(0,idx);
			}
		}
		return ans;
	}

}
