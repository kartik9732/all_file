import java.util.*;
public class Reverse_string {
    public static String reverse(String str){
        Stack<Character>s=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }
        return sb.toString();

    }
  public static void main(String[] args) {
    String str="abc";
    System.out.println(reverse(str));

  }  
}
