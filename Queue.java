
public class Queue {

    int n = 10;
    int arr[] = new int[n];
    int front = -1, rear = -1;

    boolean isEmpty() {
        return front==-1;
    }

    boolean isFull() {
        return (rear == n-1);
    }

    void enque(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            arr[++rear] = x;
            if (front == -1) {
                front++;
            }
        }
    }

    void deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else if (front == rear) {
            System.out.println("deleted element is " + arr[front]);
            front = rear = -1;
        } else {
            System.out.println("deleted element is " + arr[front]);
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.enque(10);
        q.display();
        q.deque();
        q.display();
    }
}
