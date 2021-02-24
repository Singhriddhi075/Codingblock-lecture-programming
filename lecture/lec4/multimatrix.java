package lec4;

public class multimatrix {

	public static void main(String[] args) {
		int[][] one = { { 10, 20, 30, }, { 50, 60, 70 } };
		int[][] two = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//		display (MatrixMultiplication(one,two);

	}

	public static int[][] MatrixMultiplication(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;
		int[][] res = new int[r1][c2];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < c1; k++) {
					int temp = one[i][k] * two[k][j];
					sum = sum + temp;

				}
				res[i][j] = sum;
			}
		}

		return res;
	}

}
