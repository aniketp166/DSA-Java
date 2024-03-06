package Stack;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 3};
        int[] ans = nextSmallerElement(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] nextSmallerElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;
    }
}
