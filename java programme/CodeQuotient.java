import java.util.*;
public  class CodeQuotient {
    
   

  public static int[] reverseSubarray(int a[],  int k) {
    // Write your code here
    int n=a.length;
    for(int i=0;i<n;i+=k){
	int start=0;
      int end=Math.min(i+k-1,n-1);
      while(start<end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
      }
    }
    return a;
  }
  public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
    int k=2;
    System.out.println(reverseSubarray(a,k));
  }
}
    

