public class ArrayInBackTracking{
    public static void changeArr(int arr[],int i,int val){
        //int i=index of array
        //int value which value put there
        //base case
        if(i==arr.length){
            finalArr(arr);
            //upward arr
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);   //recursion
        //backtracking
        arr[i]=arr[i]-2;

    }
    //new function use here for print the downward arr
    public static void finalArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        //here the first i=0;val start with 1
        finalArr(arr);
    }
}