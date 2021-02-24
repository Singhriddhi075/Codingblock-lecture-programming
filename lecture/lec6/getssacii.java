package lec6;

import java.util.ArrayList;

public class getssacii {

	public static void main(String[] args) {

		System.out.println(getascii("ab"));
	}

	public static ArrayList<String> getascii(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getascii(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add(val);
			mr.add(ch + val);

			mr.add((int) ch + val);
		}
		return mr;
	}
}
