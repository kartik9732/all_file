import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        
    
    ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(5);
        //for sorting in array we use Arrays.sort(arr1);
        //for ArrayList;
        System.out.println(list);
        //print the ascending order sorting

        Collections.sort(list);
        System.out.println(list);
        //descending order sorting
         Collections.sort(list,Collections.reverseOrder());
        // //comparator it is a function which define the logic 
         System.out.println(list);

    }

    
}
