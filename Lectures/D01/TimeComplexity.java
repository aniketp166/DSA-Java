package Lectures.D01;

class TimeComplexity {
    public static void main(String args[]) {
        // decimalToBinary(10);
        // printTable(11);
        int[] arr = { 12, 13, 14, 55, 76 };

        linearSearch(23, arr);
    }

    public static void decimalToBinary(int num) {
        while (num > 0) {

            System.out.println(num % 2);
            num = num / 2;
        }
        System.out.println();
    }

    public static void printTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    public static void linearSearch(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(i);
            }
        }
    }
}