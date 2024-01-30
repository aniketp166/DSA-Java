package Stack;

public class Stack {
    int arr[];
    int size;
    int top;

    public Stack(int maxCapacity) {
        arr = new int[maxCapacity];
        size = 0;
        top = -1;
    }

    public int push(int num) {
        if (top == arr.length - 1)
            return -1;

        top++;
        arr[top] = num;
        size++;
        return num;
    }

    public int pop(int num) {
        if (top == -1)
            return -1;
        int elementToDelete = arr[top];
        top--;
        size--;
        return elementToDelete;
    }

    public int top(int num) {
        return arr[top];
    }

    public int size(int num) {
        return size;
    }

    public boolean isEmpty(int num) {
        return size == 0;
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);

        System.out.println(st.top(1));
        System.out.println(st.size(2));
        System.out.println(st.pop(3));

    }
}
