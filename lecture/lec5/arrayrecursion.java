package lec5;

public class arrayrecursion {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50}
		System.out.println(printArray(0,4));

	}
	public static void printArray(int[] arr,int idx) {
		if(idx==arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printArray(arr,idx+1);
	}

}
