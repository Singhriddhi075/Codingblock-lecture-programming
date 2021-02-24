package lac3;

import java.util.Scanner;

public class max {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeInput();
		int[] arr = { 10, 20, 30, 40 };
		public static int[] takeInput() {
		display(arr);
		System.out.println(max(arr));
		System.out.println(linearSearch(arr, 30));
		System.out.println(binarySearch(arr,20));
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

	public static int max(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}
		}
		
		return max;
	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] arr,int item) {
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(item>arr[mid]) {
				lo=mid+1;
			}else if(item<arr[mid]){
				hi=mid-1;
				
			}else {
				return mid;
			}
		}
		return -1;
	}

}
