import java.util.*;
public  class IncreasingOrder{
    public static void funIncreasing(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //work
        funIncreasing(n-1);
        //print the last value n
        System.out.println(n+" ");
        
    }
public static void main(String[] args) {
    int n=10;
    funIncreasing(n);

}

}