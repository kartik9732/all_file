import java.util.*;
public class Searchitrative {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //methods
    public static Node head;
    public static Node tail;
    public static int size;
    public static void add(int data){
        Node newNode=new Node(data);
        size++;
        newNode.next=head;
        head=newNode;
    }
    //search in iterative approach
    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;

            }
            temp=temp.next;
            i++;
        }
        //key not exit in this ll
        return -1;
    }

    //recursive search//
    //helper function
    public int helper(Node head,int key){
        //base case
        if(head==null){
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next,key);
            if(idx==-1){
                return-1;
            }

        
        return idx+1;       //idx=0 always return the head position this head is not original head

    }
    public int recursiveSearch(int key){
        return helper(head,key);
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
        Searchitrative ll=new Searchitrative();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.print();
        System.out.println(ll.search(3));
        System.out.println(ll.search(45));
        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));
    }
}
