
public class CircularLinkedList {

    Node head;
    Node tail;

    boolean isEmpty() {
        return head == null;
    }

    int sije() {
        int c = 0;
        Node temp = head;
        do {
            c++;
            temp = temp.next;
        } while (temp != head);
        return c;
    }

    void insertValue(int x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }

    void insertPosition(int pos, int val) {

        Node temp = new Node(val);
        if (pos > sije() + 1) {
            System.out.println("invalid position");
        } else {
            if (pos == 1) {
                temp.next = head;
                tail.next = temp;
                head = temp;
            } else {
                if (pos == sije() + 1) {
                    tail.next = temp;
                    temp.next = head;
                    tail = temp;
                } else {
                    Node curr = head;
                    //Node prev = head;
                    for (int i = 1; i < pos - 1; i++) {
                        //prev = curr;
                        curr = curr.next;
                    }
                    //prev.next = temp;
                    temp.next = curr.next;
                    curr.next = temp;
                }
            }
        }
    }

    void delete(int p) {
        //int num = 0;
        if (isEmpty()) {
            System.out.println("Invalid operation");
        } else {
            if (p == 1) {
                System.out.println("\ndeleted element is " + head.data);
                head = head.next;
                tail.next = head;
            } else {
                Node curr = head;
                //Node prev = null;
                for (int i = 1; i < p - 1; i++) {
                    //prev = curr;
                    curr = curr.next;
                }
                //num = curr.next.data;
                curr.next = curr.next.next;
            }
        }

    }

    void search(int x) {
        int pos = 0;
        boolean flag=false;
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node curr = head;
            do {
                pos++;
                if (curr.data == x) {
                    System.out.println("\nElement found at:" + pos + " position");
                    flag=true;
                    break;
                }
                curr = curr.next;
            } while (curr != head);
        }
        if(flag==false)
        System.out.println("\nElement Not Found ");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node curr = head;
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);
        }
    }

    public static void main(String args[]) {
        CircularLinkedList ls = new CircularLinkedList();
        ls.insertValue(10);
        ls.insertValue(20);
        ls.insertValue(30);
        ls.insertValue(40);
        ls.insertPosition(3, 80);
        //System.out.println(ls.sije());
        ls.display();
        ls.search(100);
          ls.delete(2);
        ls.display();
//        ls.delete(2);
//        ls.delete(5);
//        ls.display();

    }
}
