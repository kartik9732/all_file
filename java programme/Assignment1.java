import java.util.*;
public class Assignment1 {
    /*  public static boolean contain_duplicate(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;i<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(contain_duplicate(nums));
    }

    
} */


//O(N)
public boolean assignment(int nums[]){
    Hashset<Integer>set=new Hashset<Integer>();
    for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            //contains use for search the element in hashset
            return true;
        }
        else{
            set.add(nums[i]);
        }
    }
    return false;


}
public static void main(String[] args) {
    int nums[]={1,2,3,1};
}
}
