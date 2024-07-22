package Hashing;

import java.util.*;

public class Subarray {
	// Find the length of largest subarray with 0 sum
	static int subArray(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; ++i) {
			int sum = 0;
			for (int j = i; j < arr.length; ++j) {
				sum += arr[j];
				if (sum == 0) {
					max = Math.max(max, j - i + 1);
				}
			}
		}
		return max;
	}

	public static void main(String args[]) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(subArray(arr));
	}
}
