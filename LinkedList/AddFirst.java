import java.util.*;
public class AddFirst {
    public static class Node{
        int data;
        Node next;
        public   Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //methods
    public  void addFirst(int data){
        //here not wanted static cause static function only can call the static function
        //but here we only call through object
        Node newNode=new Node(data);
        size++;
        //step 1
        //base case
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2
        newNode.next=head;  //link
        //3 rd step
        head=newNode;
    }
    public void addLast(int data){
        //1 -step
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //2 -step
        tail.next=newNode;
        //3 rd step
        tail=newNode;
    }
    //add in middle
    public void inMiddle(int idx,int data){
        Node temp=head;
        int i=0;
        Node newNode=new Node(data);
        size++;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;
        newNode.next=temp.next;
        //temp=prev;
        temp.next=newNode;
    }
    // remove first from the linked List
    public int removeFirst(){
        //base condition

        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            //update head and tail
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        
        //start loop and reach the n-2 possition
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    //while reach this n-2 possition
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        //create linked list
        AddFirst ll=new AddFirst();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.inMiddle(2,14);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.print();
       System.out.println(ll.size);
       ll.removeFirst();
       ll.print();
       System.out.println(ll.size);
       //remove last
       ll.removeLast();
       ll.print();
       System.out.println(ll.size);

    }
}
