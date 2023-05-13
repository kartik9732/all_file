import java.util.HashMap;
public class Add {
    public static void main(String[] args) {
        //create Hashmap
        HashMap<String,Integer>hm=new HashMap<>();
        //add or insert the value
        hm.put("India",100);
        hm.put("chaina",150);
        hm.put("us",50);
        //print the HashMap
        System.out.println(hm);
        //get the value
        int population=hm.get("India");
        System.out.println(population);

        //undifined key
        System.out.println(hm.get("canada"));
        //contains key
        //check key exit or not
        //return true of false 
        System.out.println(hm.containsKey("India"));// true
        System.out.println(hm.containsKey("canada"));//false
        //remove ---O(1);
        System.out.println(hm.remove("India"));//100
        //size
        System.out.println(hm.size());//

        //clear function 
        hm.clear();
        //Is Empty
        //check the empty or not
        System.out.println(hm.isEmpty());

    }
    
}
