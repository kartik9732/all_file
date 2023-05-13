import java.util.*;
public class Jsf {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();   //we can create ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        if(!q.isEmpty()){
            System.out.println(q.peek());
         q.remove();
         }
    }
}
