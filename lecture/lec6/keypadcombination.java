package lec6;

import java.util.ArrayList;
import java.util.Scanner;

public class keypadcombination {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(getKPC("145"));

	}

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getKPC(ros);
		ArrayList<String> mr = new ArrayList<>();
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			for (String val : rr) {
				mr.add(code.charAt(i) + val);
			}
		}
		return mr;
	}

	private static String getCode(char ch) {
		// TODO Auto-generated method stub
		return null;
	}

}
