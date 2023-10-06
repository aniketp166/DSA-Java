package Lectures.D02;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 6, 6, 77, 88, 99 };

        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void SelectionSort(int[] arr) {
        int n = arr.length, temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // to decreasing order arr[i]< arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
