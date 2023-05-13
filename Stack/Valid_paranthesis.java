import java.util.*;
public class Valid_paranthesis {
    public static boolean isValid(String str){
        Stack<Character> s =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //openning bracket
            if(ch=='(' || ch=='{'||ch=='['){
                s.push(ch);
            }
            else{
                //clossing case
                //)))));
                if(s.isEmpty()){
                    return false;
                }
                //pair case
                if((s.peek()=='(' || s.peek()==')')
                 ||(s.peek()=='(' || s.peek()==')')
                 ||(s.peek()=='(' || s.peek()==')')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
         } else{
            return false;
         }
        
    }
    public static void main(String[] args) {
        String str="{()}";
       
        System.out.println(isValid(str));
    }
}
