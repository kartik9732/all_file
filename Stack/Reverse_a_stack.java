import java.util.*;
public class Reverse_a_stack {
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        
        int top=s.pop();
        reverse(s);
        
            s.push(top);
        
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
