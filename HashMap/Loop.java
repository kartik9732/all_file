import java.util.*;
public class Loop {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("us",50);
        hm.put("chaina",150);
        hm.put("nepal",23);
        hm.put("bhutan",13);

        //itarate o key set
        Set<String>keys=hm.keySet();
        System.out.println(keys+" ");
        //loop over the key
        for(String k:keys)
        System.out.println("kays are " + k +" ,value is "+hm.get(k));

    }
    
}
