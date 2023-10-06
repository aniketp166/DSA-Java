import java.util.*;

class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(product(n));
        }
    }

    public static int product(int n) {
        String ans = "";
        for (int div = 9; div >= 2; div--) {
            while (n % div == 0) {
                n = n / div;
                ans = div + ans;
            }
        }

        if (n != 1) {
            return -1;
        } else {
            return Integer.parseInt(ans);
        }
    }
}