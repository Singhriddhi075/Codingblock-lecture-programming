package lac3;

import java.util.Scanner;

public class inversearray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] inv = Inversearray(arr);
		display(inv);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + ",");
	}

	public static int[] Inversearray(int[] arr) {

		int[] inv = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			inv[arr[i]] = i;
		}
		return inv;
	}

}
