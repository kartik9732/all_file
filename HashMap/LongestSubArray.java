import java.util.*;
public class LongestSubArray {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>map=new HashMap<>();
        //total
        //store the index value
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                len=i+1;
            }
            
               if(map.containsKey(sum)){
                int k=i-map.get(sum);
                //j-i
                len=Math.max(len,k);
               }
               else{
                map.put(sum,i);
               }
        
        }
        System.out.println(len);
    }
    
}
