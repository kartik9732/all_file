import java.util.LinkedList;
public class UsingFrameWork {
    public static void main(String[] args) {
        //create
        //in object from like Integer,Float,
        LinkedList<Integer>ll=new LinkedList<>();
        //operation
        //add
        ll.addLast(3);
        ll.addLast(2);
        ll.addFirst(0);
        //print
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
