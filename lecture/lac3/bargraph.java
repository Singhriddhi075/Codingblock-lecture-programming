package lac3;

public class bargraph {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3 };
		barGraph(arr);
	}

	public static void barGraph(int[] arr) {
		int max = max(arr);
		for (int r = 1; r <= max; r++)
		{
			for (int c = 0; c < arr.length; c++)
			{
				if (r <= max - arr[c]) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

	public static int max(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}
		}

		return max;
	}

}
