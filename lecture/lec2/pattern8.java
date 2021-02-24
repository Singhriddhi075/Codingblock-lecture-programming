package lec2;

public class pattern8 {

	public static void main(String[] args) {
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");

			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");

			}
			System.out.println();
//			if()
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

	}
	}

}
