package Stack;

public class StackImplementation {
    int[] arr;
    int size, top;

    public StackImplementation(int num) {
        arr = new int[num];
        top = -1;
        size = 0;
    }

    public boolean push(int num) {
        if (size == arr.length) {
            System.out.println("Stack is full. Cannot push " + num);
            return false;
        }
        top++;
        size++;
        arr[top] = num;
        System.out.println("Pushed " + num + " to the stack");
        return true;
    }

    public boolean pop() {
        if (size == 0) {
            System.out.println("Stack is empty. Cannot pop");
            return false;
        }
        System.out.println("Popped " + arr[top] + " from the stack");
        top--;
        size--;
        return true;
    }

    private int size() {
        System.out.println("Current stack size is " + size);
        return size;
    }

    private boolean top() {
        if (size == 0) {
            System.out.println("Stack is empty. No top element");
            return false;
        }
        System.out.println("Top element is " + arr[top]);
        return true;
    }

    public static void main(String[] args) {
        StackImplementation st = new StackImplementation(5);
        System.out.println("Stack created with size 5");
        st.size();
        st.push(2);
        st.size();
        st.top();

        st.pop();
        st.size();
        st.top();
    }
}
