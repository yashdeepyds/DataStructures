
public class LinkedStack {

    Node top;
    Node bottom;

    boolean isEmpty() {
        return top == null;
    }

    void push(int x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            top = temp;
            bottom = temp;
        } else {
            top.next = temp;
            top = temp;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node curr = bottom;
            while (curr.next != top) {
                curr = curr.next;
            }
            System.out.println("deleted element "+ top.data);
            curr.next = null;
            top = curr;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node temp = bottom;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    
    public static void main(String args[]){
        LinkedStack ls=new LinkedStack();
        ls.push(10);
        ls.push(2);
        ls.push(30);
        ls.display();
        ls.pop();
        ls.display();
    }
}
