package lec4;

import java.util.ArrayList;

public class sumarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<>();

		int[] one = { 9, 4, 2, 4 };
		int[] two = { 4, 6 };
		System.out.println(sumoftwoArray(one, two));

	}

	public static ArrayList<Integer> sumoftwoArray(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		int carry = 0;
		int i = one.length - 1;
		int j = two.length - 1;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += one[i];
			}
			if (j >= 0) {
				sum += two[j];
			}
			int rem = sum % 10;
			carry = sum / 10;
			ans.add(0, rem);

			i--;
			j--;
		}
		if (carry != 0) {
			ans.add(0, carry);
		}
		return (ans);
	}

}
