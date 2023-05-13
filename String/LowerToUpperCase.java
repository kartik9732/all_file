import java.util.*;
public class LowerToUpperCase {
    public static String toUpperCase(String str){
    StringBuilder sb=new StringBuilder("");
    //change first letter in upper case

    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i)); //to insert the space and i++;
           i++;
            sb.append(Character.toUpperCase(str.charAt(i)));

        }
        else{
            sb.append(str.charAt(i));
        }

    }
    return sb.toString();
    }
    public static void main(String[] args) {
        String str="Hi i am kartik";
        System.out.println(toUpperCase(str));
    }
    
}
