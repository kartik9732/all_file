import java.util.*;
public class TilingProblem {
    public static int ways(int n){

        //base case
        if(n==0 || n==1){
            return 1;
        }
        //work
        //vertical case
        int vertical=ways(n-1);
        //horizontal case
        int horizental= ways(n-2);
        //total ways
        int total=vertical+horizental;
        return total;

    }
    public static void main(String[] args) {
        //2*n
        int n=2;
        System.out.println(ways(2));

    }
}
