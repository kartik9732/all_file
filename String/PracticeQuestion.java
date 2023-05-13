import java.util.*;
public class PracticeQuestion {
    public static void new(String str){
    for(int i=0;i<str.length();i++){
        int count=0;
        char ch=str.charAt(i);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    }
    System.out.println("total vowels are"+ count);
}
    public static void main(String[] args) {
        String str="aveniyohu";
    }
    
}
