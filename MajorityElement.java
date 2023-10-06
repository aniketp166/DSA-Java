// Moore's Voting Algo

public class MajorityElement {
    public static void main(String... args) {
        int[] arr = { 4, 4, 6, 5, 9, 6, 6, 6, 6, 6, 6, 6, 3, 1 };
        System.out.println(findMajority(arr, arr.length));
    }

    public static int findMajority(int[] arr, int n) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        // verify of candidate is your ans or not
        count = 0;
        for (int val : arr) {
            if (val == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

}
