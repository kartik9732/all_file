import java.util.ArrayList;
public class New {
    public static void main(String[] args) {
        
    
        ArrayList<Integer>list1=new ArrayList<>();
        //list.add O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        //get the element O(1);
        //get use for which element is store in that index
        int element=list1.get(1);
        System.out.println(element);
    //delete the element
    list1.remove(2);
    System.out.println(list1);
    list1.set(1,89);
        System.out.println(list1);
        //contains element
        //check any element exit in this array
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(23));
    list1.add(0,100);
    System.out.println(list1);
    //time complexity is O(n);
    }
}
    
    

