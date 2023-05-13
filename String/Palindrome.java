import java.util.*;
public class Palindrome {
    //divide in two part next
    //next compare first letter with last letter
    //SECOND letter compare with SECOND last
    public static boolean check(String str){
    int n=str.length();
    for(int i=0;i<n/2;i++){
        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        //String str="racecar";
        String str="kartik";

        System.out.println(check(str));
    }
    
}
