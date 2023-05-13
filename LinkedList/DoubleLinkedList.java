import java.util.*;
public class DoubleLinkedList {
    public static  class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //removefirst
    public int  removeFirst(int data){
if(head==null){
    System.out.println("empty");
    return Integer.MIN_VALUE;
}
//corner case size==1
if(size==1){
    int val=head.data;
    head=tail=null;
    size--;
    return val;
}
int val=head.data;
head=head.next;
head.prev=null;
size--;
return val;
    }

//print
public void print(){
    Node temp=head;
    if(head==null){
        System.out.println("ll is empty");
    }
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        DoubleLinkedList dll=new DoubleLinkedList();
        
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        System.out.println(dll.removeFirst());
        dll.print();        
    }
}
