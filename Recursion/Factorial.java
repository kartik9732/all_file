import java.util.*;
public class Factorial {
    public static int  factorial(int n){
        //base case
        if(n==0){
          
            return 1;
        }
        int func=factorial(n-1);
        int fn=n*func;
        return fn;

    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(factorial(5));

    }
    
}
