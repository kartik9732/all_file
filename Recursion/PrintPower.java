import java.util.*;
public class PrintPower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int num=x*power(x,n-1);
        return num;
        
    }
    public static void main(String[] args) {
        //2^n;
        int x;
        int n;
        System.out.println(power(2,4));

    }
    
}
