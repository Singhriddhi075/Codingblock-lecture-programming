package lec2;

public class pattern {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			for (int col = 1; col <= n; col = col + 1) {
				if (row == 1 || row == n || col == 1 || col == n)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
			row = row + 1;
		}
	}

}
