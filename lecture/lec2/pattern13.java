package lec2;

public class pattern13 {

	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = 2 * n - 3;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			int cst = 1;
			if (row == n)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
			nst++;
			nsp = nsp - 2;
			row++;
		}

	}

}
