package lec5;

public class lastindex {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 30, 30, 50 };
		System.out.println(lastindex(arr, 0, 30));
	}

	public static int lastindex(int[] arr, int idx, int item) {
		if (idx == arr.length) {
			return -1;
		}

		int fi = lastindex(arr, idx + 1, item);
		if (arr[idx] == item && fi == -1) {
			return idx;
		} else {
			return fi;
		}
	}

}
