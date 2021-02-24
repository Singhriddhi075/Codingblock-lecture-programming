package lec5;

public class power {

	public static void main(String[] args) {

		System.out.println(power(2, 3));
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pwr1 = power(x, n - 1);
		int pwr = pwr1 * x;
		return pwr;

	}

}
