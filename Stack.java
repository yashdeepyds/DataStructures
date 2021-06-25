
import java.util.Scanner;

public class Stack {

    //Scanner sc = new Scanner(System.in);
    int n = 10;
    int arr[] = new int[n];
    int top = -1;

    void push(int x) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;

        }
    }

    int pop() {
        int rem = -1;
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            rem = arr[top];
            top--;
        }
        return rem;
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.display();
        st.pop();
        st.display();
    }

}
