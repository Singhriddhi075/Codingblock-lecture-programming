package lac3;

import java.util.Scanner;

public class subarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };
		subarray(arr);
		sumsubarray(arr);

	}

	public static void subarray(int[] arr) {
		for (int si = 0; si < arr.length; si++) {
			for (int ei = si; ei < arr.length; ei++) {

				for (int k = si; k <= ei; k++)
					System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
	}

	public static void sumsubarray(int[] arr) {
		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {

				for (int k = si; k <= ei; k++)
					sum += arr[k];
			}
			System.out.println(sum);
		}

	}

}
