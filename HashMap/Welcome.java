import java.util.*;

public class Welcome {
    public static void main(String[] args) {
        //hashset
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        if(hs.contains(2)){
            System.out.println("2 is present here");
            //size
            System.out.println(hs.size());
            //remove
            hs.remove(2);
            System.out.println(hs);
            //clear
            hs.clear();
            System.out.println(hs);
            
            
        
           System.out.println(hs.isEmpty());
        }
    }
    
}
