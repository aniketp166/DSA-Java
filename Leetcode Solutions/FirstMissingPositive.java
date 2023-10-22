class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println("The smallest missing positive integer is: " + i);
                return;
            }
        }
        System.out.println("The smallest missing positive integer is: " + (n + 1));
    }
}
