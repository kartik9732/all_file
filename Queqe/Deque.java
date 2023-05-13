import java.util.*;
public class Deque {
  public static void main(String[] args) {
    Deque<Integer>deque=new LinkedList<>();
    deque.addFirst(1);
    deque.addFirst(2);
    System.out.println(deque); //1 2
    deque.addLast(3); //
    System.out.println(deque); //1 2 3
    deque.removeFirst();
    System.out.println(deque); // 2 3
    System.out.println(deque.getFirst());
    System.out.println(deque.getLast());

  }  
}
