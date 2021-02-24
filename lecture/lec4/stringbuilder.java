package lec4;

public class stringbuilder {

	public static void main(String[] args) {

		System.out.println(replaceascii("CdEfG"));

	}

	public static StringBuilder replaceascii(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {
			char ch = sb.charAt(i);
			if (i % 2 == 0) {
				sb.setCharAt(i, ++ch);
			} else {
				sb.setCharAt(i, ch);
			}
		}
		return (sb);
	}
}
