import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set=new HashSet<>();

        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        // 2nd array
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        System.out.println("the union count is="+set.size());

        //inetersection
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        //check
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);    //remove from set

            }
        }
        System.out.println("total count value is ="+ count);



    }
    
}
