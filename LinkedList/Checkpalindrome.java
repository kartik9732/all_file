import java.util.*;
public class Checkpalindrome {
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

    //find the mid
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        //even and odd case
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow is only mid
        return slow;
    }
    //check boolean or not
    public boolean check(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1 find the mid
        Node midNode=findMid(head); //work as helper function

        //step 2 reverse the 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev ;   //when curr ==null so head=prev
    Node left=head;
        //3rd check left and right half is same or not
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

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
    Checkpalindrome ll=new  Checkpalindrome();
        ll.addFinal(1);
        ll.addFinal(2);
        ll.addFinal(2);
        ll.addFinal(1);
        ll.print(); 
        System.out.println(ll.check());  
        
   } 
}
