public class RotateMatrix90 {
    public static void main(String... args) {
        int[][] arr = { { 1, 2, 3, 5 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 } };

        rotateBy90(arr);
        print(arr);
    }

    public static void print(int[][] arr) {

        for (int[] a : arr) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void rotateBy90(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                // Swap arr[i][j] with arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swap the columns
        int left = 0, right = arr[0].length - 1;
        while (left < right) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }
    }
}
