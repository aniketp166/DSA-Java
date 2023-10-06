package Lectures.D02;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 11, 22, 33, 44, 55, 6, 6, 77, 88, 99 };
        System.out.println("Enter number to Find");

        int key = sc.nextInt();
        // int index = binarySearch(arr, key);
        int index1 = binarySearchUsingRecursion(arr, 0, arr.length - 1, key);

        // if (index == -1) {
        // System.out.println("Element not found");
        // } else {
        // System.out.println("Element found at " + index);
        // }
        if (index1 == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + index1);
        }
    }

    private static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1, mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                right = mid - 1;
            } else // if (key > arr[mid])
            {
                left = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchUsingRecursion(int[] arr, int l, int r, int key) {
        int i;
        if (r < l)
            return -1;
        int m = (l + r) / 2;
        if (key == arr[m]) {
            return m;
        }
        if (key < arr[m]) {
            i = binarySearchUsingRecursion(arr, l, m - 1, key);
        } else {
            i = binarySearchUsingRecursion(arr, m + 1, r, key);
        }
        return i;

        // return key < arr[m] ? binarySearchUsingRecursion(arr, l, m - 1, key)
        // : binarySearchUsingRecursion(arr, m + 1, r, key);

    }

}
