package lac3;

import java.util.Scanner;

public class array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeInput();
		int[] arr = { 10, 20, 30, 40 };
		display(arr);
	}

	public static int[] takeInput() {
		System.out.println("size?");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + ",");
	}
}
