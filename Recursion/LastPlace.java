import java.util.*;
public class LastPlace {
    public static void check(int n,int lastPlace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kam
        check(n-1,0,str+"0");
        //n-1,0 tell the next step that we have 0 in last place
        if(lastPlace==0){
            check(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        check(3,0,new String(""));
    }
}
