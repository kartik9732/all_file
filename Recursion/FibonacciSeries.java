import java.util.*;
public class FibonacciSeries {
    public static int fib(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        //work
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int total_fib=(fib1+fib2);
        return total_fib;

    }
    public static void main(String[] args) {
        //int n=5;
        //int n=6;
        // int n=7;
         int n=8;
n
        System.out.println(fib(n));
    }
    
}
