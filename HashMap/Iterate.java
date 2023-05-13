import java.util.*;
public class Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //add or insert the value
        hm.put("India",100);
        hm.put("chaina",150);
        hm.put("us",50);
        //Iterate the hashMa
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        //for each loop
        for (String k: keys) {
            //key type key name:key
            System.out.println("key="+k+",value"+hm.get(k));
            
        }

    }
    
}
