package lec6;

import java.util.Scanner;
import java.util.ArrayList;

public class cointoss {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(coinToss(3));

	}

	public static ArrayList<String> coinToss(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		ArrayList<String> rr = coinToss(n - 1);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add("H" + val);
			mr.add("T" + val);

		}
		return mr;
	}

}
