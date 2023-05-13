import java.util.*;
public class LastOccurenceAdvance{
    public static int lastOccurenceFound(int arr[],int key,int i){
        int isFound=lastOccurenceFound(arr,key,i+1){
            if(arr[i]==-1 && arr[i]==key){
                return i;
            }
            return isFound;
        }
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,10,3};
        lastOccurenceFound(arr,10,0);
    }
}