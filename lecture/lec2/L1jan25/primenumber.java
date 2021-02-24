package L1jan25;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 0;
		int div = 1;
		while (div <= n) {
			if (n % div == 0) {
				fact = fact + 1;
			}

			div = div + 1;
		}
		if (fact == 2) {
			System.out.println("prime");
		} else
			System.out.println("not prime");

	}

}
