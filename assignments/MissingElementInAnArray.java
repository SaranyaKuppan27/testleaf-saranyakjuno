package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("missing num is");
		for (int j = arr[0]; j < arr.length; j++) {
			if (j != arr[j - 1]) {
				System.out.println(j);
				break;
			}
		}
	}
}