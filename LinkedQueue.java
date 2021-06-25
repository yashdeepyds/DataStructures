
public class LinkedQueue {
    Node front;
    Node end;
    
    boolean isEmpty(){
        return front==null;
    }
    
     void enque(int x){
         Node temp=new Node(x);
         if(isEmpty()){
             front=end=temp;
         }else{
             end.next=temp;
             end=temp;
         }
     }
     
     void deque(){
         if(isEmpty()){
             System.out.println("Empty");
         }else{
             if(front==end){
                 System.out.println("Deleted data "+front.data);
                 front=end=null;
             }else{
                 System.out.println("Deleted data "+front.data);
                 front=front.next;
             }
         }
     }
     
     void display(){
         if(isEmpty()){
             System.out.println("Empty");
         }else{
             Node curr=front;
               while(curr != null)
               {
                   System.out.println(curr.data);
                   curr=curr.next;
               }
         }
     }
     public static void main(String args[])
     {
         LinkedQueue lc=new LinkedQueue();
         lc.enque(10);
         lc.enque(20);
         lc.enque(30);
         lc.deque();
         lc.display();
     }
}
