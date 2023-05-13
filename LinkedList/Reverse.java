import java.util.*;
public class Reverse {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    //add function
    public void addFinal(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //reverse the limked list//
    public void reverseFianl(){
        Node prev=null;
        Node curr=tail=head; //
        Node next;
    
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

    }
    head=prev;     // update the head;
}
//remove from last nth loop
//calculate the size
public void removefromNth(int n){
int sz=0;
Node temp=head;
while(temp!=null){
    temp=temp.next;
    sz++;
}
//remove n th size-n+1=from first
//find the prev
//base
if(n==sz){
    //n size er equal
    //so remove the first
    head=head.next;
    return;
}
//n th node 
Node prev=head;
int i=1;
while(i<sz-n){
    prev=prev.next;
    i++;
}
//when reach the prev
prev.next=prev.next.next;
return;
}
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
        Reverse ll=new Reverse();
        ll.addFinal(1);
        ll.addFinal(2);
        ll.addFinal(3);
        ll.addFinal(4);
        ll.addFinal(5);
        ll.print();     // 5-4-3-2-1-null

         ll.reverseFianl();
         ll.print();         //1-2-3-4-5-null
        ll.removefromNth(2);
        ll.print();
        


    }
}
