import java.util.*;

public class Implement_using_array {
    public static class Queue{
        static int arr[];
        //arr is static cause i dont know the size of arr
        static int size;
        static int rear;
        //constructor
        Queue(int n){
            //n=size
            arr=new int [n];
            size=n;
            //first rear inicilize at -1 
            //cause when new element add rear backword
            rear=-1;
        }
        //isEmpty function
        public static boolean isEmpty(){
            return rear ==-1;
            //how we inicilize at the first
            //rear ==-1 true this is empty

        }
    //add in queue
    public static void add(int data){
        //check
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    } 
    //remove from the queue
     public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1; //in case of abs we return @ # etc

        }
        int front=arr[0];    //what we want to delete
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
     } 
     //peek function
     public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
     }   
    }
    public static void main(String[] args) {
        Queue qu=new Queue(5);  //size of full arr=n
        qu.add(1);
        qu.add(2);
        qu.add(3);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }

    }
}
