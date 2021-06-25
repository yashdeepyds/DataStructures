
class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {

    Node head = null;

    boolean isEmpty() {
        return head == null;
    }

    int sije(){
        int c=0;
        Node temp=head;
        while(temp != null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    void insertValue(int x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = temp;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    void insertPosition(int pos, int val) {

        Node temp = new Node(val);
        if(pos>sije()+1){
            System.out.println("invalid position");
        }else{
        if (pos == 1) {
            temp.next = head;
            head = temp;
        } else {
            Node curr = head;
            Node prev = head;
            for (int i = 1; i < pos; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = temp;
            temp.next = curr;
        }
        }
    }

    void delete(int p) {
        int num = 0;
        if (isEmpty() || p>sije()) {
            System.out.println("Invalid operation");
        } else {
            if (p == 1) {
                num = head.data;
                head = head.next;
            } else {
                Node curr = head;
                //Node prev = null;
                for (int i = 1; i < p - 1; i++) {
                    //prev = curr;
                    curr = curr.next;
                }
                num = curr.next.data;
                curr.next = curr.next.next;
            }
        }
        System.out.println("\ndeleted element is " + num);
    }

    void search(int x) {
        int pos = 0;
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node curr = head;
            while (curr != null) {
                pos++;
                if (curr.data == x) {
                    System.out.println("\nElement found at:" + pos + " position");
                    break;
                } else {
                    curr = curr.next;
                }
            }
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String args[]) {
        LinkedList ls = new LinkedList();
        ls.insertValue(10);
        ls.insertValue(20);
        ls.insertValue(30);
        ls.insertValue(40);
        ls.insertPosition(5, 80);
        ls.display();
//        ls.search(20);
//        ls.delete(1);
//        ls.display();
//        ls.delete(2);
//        ls.delete(5);
//        ls.display();

    }
}
