package lec5;

public class maximum {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 90, 40, 50, 60 };

		System.out.println(maximum(arr, 0));
	}

	public static int maximum(int[] arr, int idx) {
		if (idx == arr.length) {
			return Integer.MIN_VALUE;
		}
		int max1 = maximum(arr, idx + 1);
		if (max1 > arr[idx]) {
			return max1;
		} else {
			return arr[idx];
		}
// or return Math.max(arr[idx],max1)
	}

}
