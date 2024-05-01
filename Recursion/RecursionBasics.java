package Recursion;

public class RecursionBasics {
    static void Print(int N) {
        if (N <= 0) {
            return;
        }
        System.out.println(N);
        Print(N - 1);
        // System.out.println(N);
    }

    static int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int Power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * Power(a, b - 1);
    }

    static int ArrAdd(int i, int[] arr) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + ArrAdd((i + 1), arr);
    }

    static int SumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        int newInt = n / 10;
        int reminder = n % 10;

        return reminder + SumOfDigits(newInt);

    }

    // leetcode 62
    static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
    // leetcode 326

    public boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n <= 0 || n % 3 != 0)
            return false;

        return isPowerOfThree(n / 3);

    }

    public static void main(String[] args) {
        Print(5);
        // int n = 8;
        // for (int i = 0; i < n; i++) {
        // System.out.println(Fibonacci(i));
        // }

        // System.out.println(Power(3, 4));

        // int[] arr = { 1, 2, 3, 4, 6 };
        // System.out.println(ArrAdd(0, arr));
        // System.out.println(SumOfDigits(45));
        // System.out.println(uniquePaths(7, 3));
    }
}
