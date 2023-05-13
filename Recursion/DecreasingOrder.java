import java.util.*;
public class DecreasingOrder{
    public static void print(int n){
        //base condition
        if(n==1){
            System.out.print(n);
            return;

        }
        System.out.print(n+" ");    //n+f(n-1)// 10+f(9);
        //inner function call
        print(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        print(n);
    
    

}
}