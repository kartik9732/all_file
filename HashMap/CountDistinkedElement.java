import java.util.*;
public class CountDistinkedElement {

    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<num.length;i++){
            map.add(num[i]);
        }
        System.out.println("final result="+map.size());
    }
    
}
