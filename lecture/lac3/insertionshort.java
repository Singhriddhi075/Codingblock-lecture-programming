package lac3;

public class insertionshort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		insertionSort(arr);
		display(arr);

	}

	public static void insertionSort(int[] arr) {
		for (int count = 1; count <= arr.length - 1; count++) {
			int item = arr[count];
			int j = count - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + ",");
	}
}
