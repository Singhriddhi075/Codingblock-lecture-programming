package lec5;

import java.util.Scanner;

public class allindex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 30, 30, 60 };
		int[] ans = allIndexes(arr, 0, 30, 0);

	}

	public static int[] allIndexes(int[] arr, int idx, int item, int count) {
		if (idx == arr.length) {
			int[] br = new int[count];
			return br;
		}
		if (arr[idx] == item) {
			int[] rr = allIndexes(arr, idx + 1, item, count + 1);
			rr[count] = idx;
			return rr;
		} else {
			int[] rr = allIndexes(arr, idx + 1, item, count);
			return rr;
		}
	}

}
