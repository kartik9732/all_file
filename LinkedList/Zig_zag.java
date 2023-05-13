import java.util.*;
public class Zig_zag {
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
    public void addFinal(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //zig zag linked list
    public void zigzag(){
        //find mid

        Node slow=head;
        Node fast=head;
        //Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //when reach
        Node mid= slow; //its now thw mid
        //reverse the 2nd half
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        // alternate merge 
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //update
            left=nextL;
            right=nextR;
        }



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
        Zig_zag ll=new Zig_zag();
        ll.addFinal(6);
        ll.addFinal(5);
        ll.addFinal(4);
        ll.addFinal(3);
        ll.addFinal(2);
        ll.addFinal(1);

        ll.print();
        ll.zigzag();
        ll.print(); 
    }
}        
        
        