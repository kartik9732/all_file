import java.util.*;
public class MejorityElements {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){   
        //      // check if true 
            
        //     map.put(arr[i],map.get(arr[i])+1);
        //  }
        //  //false case
        //  else{
        //  map.put(arr[i],1);
        //  }
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
    }
    Set<Integer>keys=map.keySet();
    for(Integer key:keys){
        if (map.get(key)>arr.length/3){
            System.out.println(key);
        }

    }
    
}
}
