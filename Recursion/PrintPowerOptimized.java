import java.util.*;
public class PrintPowerOptimized {
    public static int  checkPower(int a,int n){
        //base case
        if(n==0){
            return 1;
        }
        int halfPowerSq=checkPower(a,n/2) * checkPower(a,n/2);
        //when n==odd;
        if(n%2!=0){
            halfPowerSq=a* halfPowerSq;
        }
        return  halfPowerSq ;
    }
    public static void main(String[] args) {
        int a=2;
        int n=6;
        System.out.println(checkPower(2,6));
    }
}
