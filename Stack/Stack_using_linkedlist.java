import java.util.*;
public class Stack_using_linkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Stack{
        public static Node head=null;
        //create the head node and inicilize it as null;
        public static boolean isEmpty(){
            return head==null;
        }
        //push function;
        public static void push(int data){
            Node newNode =new Node(data);
            if(isEmpty()){
               head=newNode;
               return; 
            }
            newNode.next=head;
            head=newNode;
        }
        //pop function
        public static int pop(){
            if(isEmpty()){
                
                return -1; 
             }
             int top=head.data;
             head=head.next;
             return top;
        }
        //peek function in statck
        public static int peek(){
            if(isEmpty()){
                
                return -1; 
             }
             return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
}
}
