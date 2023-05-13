import java.util.*;
public class FirstOccurence {
    public static int firstOccurence(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        //work
        if(arr[i]==key){
            return i;

        }
        //recursion function
        return firstOccurence(arr,key,i+1);

      

    }
    
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,10,3};
        //0 indexing array

        System.out.println(firstOccurence(arr,10,0));
    }
    
}
