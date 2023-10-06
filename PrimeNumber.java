public class PrimeNumber {
    public static void main(String[] args) {
        primeNumbers(10);
    }

    public static void primeNumbers(int n) {
        for (int num = 0; num <= n; num++) {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0)
                    break;
            }
            if (i == num)
                System.out.println(num);
        }
    }
}
