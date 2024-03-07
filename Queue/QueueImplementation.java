package Queue;

public class QueueImplementation {
    int arr[];
    int front, rear, count, size;

    public QueueImplementation(int num) {
        arr = new int[num];
        size = num;
        front = 0;
        rear = 0;
        count = 0;
    }

    public void push(int num) {
        if (!isFull()) {
            arr[rear] = num;
            rear = (rear + 1) % size;
            count++;
            System.out.println("Pushed " + num + " to the queue");
        } else {
            System.out.println("Queue is full. Cannot push " + num);
        }
    }

    public int top() {
        if (!isEmpty()) {
            return arr[front];
        } else {
            System.out.println("Queue is empty. No front element");
            return -1; // Or throw an exception
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println("Popped " + arr[front] + " from the queue");
            front = (front + 1) % size;
            count--;
        } else {
            System.out.println("Queue is empty. Cannot pop");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public int peek() {
        if (!isEmpty()) {
            System.out.println("Peeked " + arr[front] + " from the queue");
            return arr[front];
        } else {
            System.out.println("Queue is empty. No front element");
            return -1; // Or throw an exception
        }
    }

    public void printQueue() {
        System.out.print("Current queue: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation qi = new QueueImplementation(5);
        qi.push(3);
        qi.push(2);
        qi.push(1);
        qi.push(6);
        qi.push(7);
        qi.printQueue();
        System.out.println("Top element: " + qi.top());
        qi.pop();
        System.out.println("Top element after pop: " + qi.top());
        qi.printQueue();
    }
}
