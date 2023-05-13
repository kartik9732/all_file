import java.util.*;
public class LoopHs {
    public static void main(String[] args) {
        HashSet<String>city=new HashSet<>();
        city.add("mumbai");
        city.add("delhi");
        city.add("kolkata");
        city.add("pune");
        city.add("hydrabad");
        Iterator i=city.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //for each loop
        for(String c:city){
            System.out.println(c);
        }
    }
    
}
