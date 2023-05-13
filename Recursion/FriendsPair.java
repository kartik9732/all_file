import java.util.*;
public class FriendsPair {
    public static int friendsPair(int n){
        //base case{
            if(n==1 || n==2){
                return n;
            }
        //work
        //when n is single
        int fmn1=friendsPair(n-1);
        //when n is paired up
        int fmn2=friendsPair(n-2);
        int pairWays=(n-1)*(n-2);
        //here (n-1) use for pair choice
        //totaal ways
        int totalWays=fmn1+pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=5;
        //int n=3;

        System.out.println(friendsPair(5));
        //System.out.println(friendsPair(3));
    }
}
