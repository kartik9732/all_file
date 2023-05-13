import java.util.*;
public class Compare {
    public static void main(String[] args) {
        String s1="kartik";
        String s2="kartik";
        String s3=new String("kartik");
        if(s1==s2){
            //here the s1 and s2 indexing the same String in memory 
            //but where we use new key Word it create the new variable the new memory
            System.out.println("both are same ");
        }
        else{
            System.out.println("both are not equal");
        }
        // 
        if(s1.equals(s3)){
            System.out.println("both are same ");
        }
        else{
            System.out.println("both are not equal");
        }
        
        
    }
    
}
