package lac3;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		reversearray(arr);
		
		
		for(int val:arr) {
			System.out.println(val);
			
		}
		
		
		
		
	
//		rotate(arr, 4);
	}

	public static void reversearray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[i] = temp;
			i++;
			j--;
		}
		

	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
		for (int r = 1; r <= rot; r++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}
	}

}
