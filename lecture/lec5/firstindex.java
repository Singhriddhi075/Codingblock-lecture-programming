package lec5;

public class firstindex {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 30, 30, 50 };
		System.out.println(firstindex(arr, 0, 30));

	}

	public static int firstindex(int[] arr, int idx, int item) {
		if (idx == arr.length) {
			return -1;
		}

		int fi = firstindex(arr, idx + 1, item);
		if (arr[idx] == item) {
			return idx;
		} else {
			return fi;
		}
	}

}
