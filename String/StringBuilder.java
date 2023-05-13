import java.util.*;
public class StringBuilder{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder(""); 
for(char ch='a';ch<='z';ch++){
sb.append(ch+" "); 
}
//here time complexity is 
   //O(26);
   //O(26*n^2)//in sting
System.out.println(sb);
}  
}  