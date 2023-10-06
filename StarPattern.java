public class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        printStar(n);
    }

    public static void printStar(int a) {
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * a - ((2 * i) + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
