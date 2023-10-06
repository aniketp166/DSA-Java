package Lectures.D02;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        System.out.println("type number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int result = fact(number);
        System.out.println(result);
    }

    // using recursion
    static int fact(int n) {
        int r;
        if (n == 0) {
            return 1;
        }
        r = n * fact(n - 1);
        return r;

    }
}
