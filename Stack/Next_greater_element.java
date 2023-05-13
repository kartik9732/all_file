import java.util.*;
public class Next_greater_element {
    
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextGreater[]=new int[arr.length];
        //trivase from the last element
        for(int i=arr.length-1;i>=0;i--){
            //1.condition check
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                //arr[s.peek()] use for we store the index not the value
                s.pop();
            }

                    //2.if else empty or not
                    if(s.isEmpty()){
                        nextGreater[i]=-1;
                    }
                    else{
                        nextGreater[i]=arr[s.peek()];
                    }
        
        
        //3.push the index if this is graeter;
        s.push(i);
        //where we store the index in the stack

    }
    for(int i=0;i<nextGreater.length;i++){
        System.out.print(nextGreater[i]+" ");
    }
    System.out.println();
}
}
