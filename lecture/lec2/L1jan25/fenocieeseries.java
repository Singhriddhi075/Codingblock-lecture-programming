package L1jan25;

import java.util.Scanner;

public class fenocieeseries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 1;
		int a = 0;
		int b = 1;
		while (count <= n ) {
			int sum = a + b;
			System.out.println(a);
			a = b;
			b = sum;
			count = count + 1;

		}

	}

}
