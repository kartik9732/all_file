import java.util.*;
public class Circular_result {
    public static class Queue{
        static int arr[];
        //arr is static cause i dont know the size of arr
        static int size;
        static int rear;
        static int front;
        //constructor
        Queue(int n){
            //n=size
            arr=new int [n];
            size=n;
            //first rear inicilize at -1 
            //cause when new element add rear backword
            rear=-1;
            front=-1;
        }
        //isEmpty function
        public static boolean isEmpty(){
            return rear ==-1 && front==-1;
            //how we inicilize at the first
            //rear ==-1 true this is empty

        }
        //full check
        public static boolean isfull(){
            return (rear+1)%size==front;
        }
    //add in queue
    public static void add(int data){
        //check
        if(isfull()){
            System.out.println("queue is full");
            return;
        }
        //add first element where front and rear both are in -1;
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    } 
    //remove from the queue
     public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1; //in case of abs we return @ # etc

        }
        int result=arr[front];    //what we want to delete
        
        //when delete the last element
        if(rear==front){
            rear=front=-1;
        }
        else{
        front=(front+1)%size;
        }
        return result;
     } 
     //peek function
     public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
     }   
    }
    public static void main(String[] args) {
        Queue qu=new Queue(5);  //size of full arr=n
        qu.add(1);
        qu.add(2);
        qu.add(3);
        System.out.println(qu.remove());
        qu.add(4);
        System.out.println(qu.remove());
        qu.add(5);  //1 2 3 4 5

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }

    }
    
}
