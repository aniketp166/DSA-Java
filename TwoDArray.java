import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 3;

        int[][] twoDArray = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("For " + (i + 1) + " row");
            for (int j = 0; j < col; j++) {
                System.out.println("For " + (j + 1) + " Column");
                twoDArray[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
