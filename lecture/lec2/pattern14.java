package lec2;

public class pattern14 {

	public static void main(String[] args) {
		int n = 3;
		int nst = 1;
		int row = 1;
		while (row <= 2 * n - 1) {

			int val = 0;
			if (row <= n) {
				val = row;
			} else {
				val = 2 * n - 1 - row + 1;
			}
			for (int cst = 1; cst <= nst; cst++) {

//				if (row <= n / 2) {
//					System.out.print(row);
//				} else {
//					System.out.print(val);
//				}
				if (cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(val);

				}
			}
			row++;
			System.out.println();
			if (row <= n) {
				nst = nst + 2;
				val++;

			} else {
				nst = nst - 2;
				val--;
			}

		}
	}

}
