package Array;

import java.util.ArrayList;
import java.util.List;

public class Array {
    // leetcode 1572. Matrix Diagonal Sum
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - i - 1) {
                sum += mat[i][mat.length - i - 1];
            }
        }
        return sum;
    }

    // leetcode 412. Fizz Buzz
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                arr.add("FizzBuzz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                arr.add("Buzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                arr.add("Fizz");
            } else {
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }

    // leetcode 1929. Concatenation of Array
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    // leetcode 2114. Maximum Number of Words Found in Sentences
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < sentences.length; i++) {
            String arr[] = sentences[i].split(" ");
            if (max < arr.length) {
                max = arr.length;
            }
        }
        return max;
    }

    // leetcode 42. Trapping Rain Water
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            water = water + Math.min(left[i], right[i]) - height[i];
        }
        return water;
    }

    // leetcode 75.Sort Colors
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    // leetcode 189. Rotate Array
    public void rotate(int[] nums, int k) {
        int temp[] = new int[k];
        for (int i = 0; i < nums.length - 1; i++) {

        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        Array arrObj = new Array();
        arrObj.rotate(nums, 2);
    }
}