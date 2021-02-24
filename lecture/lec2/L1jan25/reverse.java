package L1jan25;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =1234;
		int ans = 0;
		while (n > 0) {

			int remainder = n % 10;
			ans = ans * 10 + remainder;
			n = n / 10;
		}
		System.out.println(ans);

	}

}
