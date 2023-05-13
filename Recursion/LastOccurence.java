import java.util.*;
import java.util.*;
public class LastOccurence {
    public static int lastOccurrence(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurrence(arr,key,i+1);
            if(arr[i]!=-1){         //Thats mean we found the key 
            return isFound;
            }
            //compare with self
            if(arr[i]==key){
                return i;
            }
        }
        
    
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,10,3};
    }
    
}
