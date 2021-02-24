package lec2;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int ans = 0;

		int temp = n;
		int nod = 0;
		while (temp > 0) {
			temp = temp / 10;
			nod++;
		}
		rot = rot % nod;
		if (rot < 0) {
			rot = rot + nod;
		}

		for (int r = 1; r <= rot; r++) {
			int rem = n % 10;
			int left = n / 10;
			ans = rem * (int) Math.pow(10, nod - 1) + left;
			n = ans;
		}
		System.out.println(n);

	}

}
