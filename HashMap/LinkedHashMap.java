import java.util.*;

public class LinkedHashMap {
    public static void main(String[] args) {
        //linked hash map design with the insertion order
        
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("us",50);
        lhm.put("chaina",150);
        lhm.put("Nepal",23);
        System.out.println(lhm);

    }
    
}
