import java.util.*;
public class CompressString {
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            //check < or less than 1
            //if < 1 we can not change 
            //abc or we did not write here lik a1b1c1
            if(count>1){
                sb.append(count);

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
    
}
