import java.util.*;
public class SumOfNaturalNumber {
    public static int  naturalNumber(int n){
        //base case
        if(n==1){
            return 1;
        }
        //work
        int num=naturalNumber(n-1);
        int total=n+num;
        return total;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(naturalNumber(n));
    }
    
}
