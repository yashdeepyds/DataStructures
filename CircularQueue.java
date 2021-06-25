
public class CircularQueue {

    int n = 5;
    int arr[] = new int[n];
    int front = -1, rear = -1;

    boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    boolean isFull() {
        return front == 0 && rear == n - 1 || front == rear + 1;
    }

    void insert(int x) {
        if (isFull()) {
            System.out.println("NO space");
        } else if (isEmpty()) {
            arr[++rear] = x;
            front++;
        } else if (front != 0 && rear == n - 1) {
            rear = 0;
            arr[rear] = x;
        } else {
            arr[++rear] = x;
        }
    }

    void delete() {
        int rem = 0;
        if (isEmpty()) {
            System.out.println("Notihng to delete");
        } else {
            if (front == rear) {
                rem = arr[front];
                front = rear = -1;
            } else {
                rem = arr[front];
                front++;
                System.out.println("deleted element is " + rem);
            }

        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                if (arr[i] > 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        CircularQueue c = new CircularQueue();
        //c.display();
        //c.delete();
        c.insert(10);
        //c.delete();
        c.insert(20);
        //c.delete();
        //c.insert(30);
        //c.insert(40);
        //c.insert(50);
        //c.display();
        c.insert(60);
        c.delete();
        c.delete();
        c.delete();
        c.display();
    }
}
