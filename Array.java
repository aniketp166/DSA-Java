public class Array {
    public static void main(String[] args) {
        int[] arr = { 35, 12, 1, 10, 36, 1 };

        // Find max int in array
        int maxInt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        System.out.println("Max int " + maxInt);

        // Find second max int in array
        int HighestInt = arr[0], SecondHighest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > HighestInt) {
                SecondHighest = HighestInt;
                HighestInt = arr[i];
            } else if (arr[i] > SecondHighest) {
                SecondHighest = arr[i];
            }
        }
        System.out.println("SecondHighest " + SecondHighest);

        /*
         * int largest = arr[0], Secondlargest = -1;
         * // reverse array
         * int low = 0, high = arr.length - 1;
         * 
         * while (low < high) {
         * int temp = arr[low];
         * arr[low] = arr[high];
         * arr[high] = temp;
         * low++;
         * high--;
         * }
         * for (int i = 0; i < arr.length; i++) {
         * System.out.println(arr[i]);
         * }
         */

    }
}
