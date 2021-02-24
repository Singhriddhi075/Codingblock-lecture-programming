package lec6;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		System.out.println((getpermutation("abc")));

	}

	public static ArrayList<String> getpermutation(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getpermutation(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				mr.add(val.substring(0, i) + ch + val.substring(i));
			}
		}
		return mr;
	}
}
