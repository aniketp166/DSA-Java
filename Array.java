public class Array {
    public static void main(String[] args) {
        int[] arr = { 35, 12, 1, 10, 36, 1, 4, 5, 6 };
        System.out.println("arr length"+arr.length);
        // Find max int in array
        int maxInt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        System.out.println("Max int " + maxInt);

        // Find second max int in array
        int HighestInt = arr[0], SecondHighest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > HighestInt) {
                SecondHighest = HighestInt;
                HighestInt = arr[i];
            } else if (arr[i] > SecondHighest) {
                SecondHighest = arr[i];
            }
        }
        System.out.println("SecondHighest " + SecondHighest);

        // reverse array
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        // reverse array in groups
        int[] arrSub = { 35, 12, 1, 10, 36, 1, 4, 5, 6, 1, 2 };
        int k = 3;
        for (int i = 0; i < arrSub.length; i = i + k) {
            int lowIndex = i, highIndex = i + k - 1;
            if (highIndex > arrSub.length - 1) {
                highIndex = arrSub.length - 1;
            }
            while (lowIndex < highIndex) {
                int temp = arrSub[lowIndex];
                arrSub[lowIndex] = arrSub[highIndex];
                arrSub[highIndex] = temp;
                lowIndex++;
                highIndex--;
            }
        }
        for (int i = 0; i < arrSub.length; i++) {
            System.out.print(arrSub[i] + " ");
        }

    }
}
