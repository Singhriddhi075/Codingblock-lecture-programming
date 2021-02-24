package lac3;

import java.util.Scanner;

public class array2d {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);
	}

	public static int[][] takeinput() {
		System.out.println("Row ?");
		int row = scn.nextInt();
		System.out.println("col ?");
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length - 1; j++) {
				System.out.println("[" + i + " " + j + "]?");
				arr[i][j] = scn.nextInt();
			}
		}

		return arr;

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + ",");
		for (int j = 0; j < arr[0].length; j++)
			;
		System.out.println(arr[j] + ",");
	}

}
