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

    public static void main(String[] args) {
        // Print(5);
        int n = 8;
        // for (int i = 0; i < n; i++) {
        // System.out.println(Fibonacci(i));
        // }

        System.out.println(Power(3, 4));
    }
}
