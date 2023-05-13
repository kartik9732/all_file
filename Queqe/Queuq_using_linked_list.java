import java.util.*;
public class Queuq_using_linked_list {
    public static class Node{
        int data;
        Node next;
         public Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    public static class Queue{
         public static Node head=null;
         public static Node tail=null;
         //check is Empty
         public static boolean isEmpty(){
            return head==null && tail==null;
         }
         //isfull not check cause here size is dynamic
         public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){ // first element add
                //front and rear are in same possition
                head=tail=newNode;
                return;

            }
            //other wise
            tail.next=newNode;
            tail=newNode;

         }
         //remove function
         public static int remove(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){ //single element
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return front;
         }
         //peek
         public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
         }


    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
