package Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> Q1 = new LinkedList<>();
    Queue<Integer> Q2 = new LinkedList<>();

    public void push(int x) {
        System.out.println("Pushing " + x + " to the stack");
        Q2.add(x);
        while(!Q1.isEmpty()){
            Q2.add(Q1.peek());
            Q1.remove();
        }
        Queue<Integer> temp = Q1;
        Q1 = Q2;
        Q2 = temp;
    }

    public void pop() {
        if (!Q1.isEmpty()) {
            System.out.println("Popping " + Q1.peek() + " from the stack");
            Q1.remove();
        } else {
            System.out.println("Stack is empty. Cannot pop");
        }
    }

    public int top() {
        if (!Q1.isEmpty()) {
            System.out.println("Top element is " + Q1.peek());
            return Q1.peek();
        } else {
            System.out.println("Stack is empty. No top element");
            return -1; // Or throw an exception
        }
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.top();
        stack.pop();
        stack.top();
    }
}
