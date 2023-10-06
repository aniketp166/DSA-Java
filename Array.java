public class Array {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };

        int largest = arr[0], Secondlargest = -1;

        // for (int i = 1; i < arr.length; i++) {

        // }

        // reverse array
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
