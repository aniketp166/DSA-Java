import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 9, 2, -5, -10, -3, -6 };
        int target = 0;
        Solution(arr, target, arr.length); // Two pointer
    }

    public static void Solution(int[] a, int target, int n) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                int j = i + 1;
                int k = n - 1;
                int tar = target - a[i];
                while (j < k) {
                    if (a[j] + a[k] == tar) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        while (j < k && a[j] == a[j - 1])
                            j++;
                        while (j < k && a[k] == a[k - 1])
                            k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
    }
}
