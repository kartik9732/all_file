import java.util.*;
public class SortedArray {
    public static boolean isSorted(int arr[],int i){
        //base case
        if(i==arr.length-1){
            return true;
        }
        //work
        if(arr[i]>arr[i+1]){
            return false;
        }
        //recursion function
       return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        //int arr[]={1,2,3,4,5};
        int arr[]={1,2,4,3,5};
        System.out.println(isSorted(arr,0));
    }
    
}
