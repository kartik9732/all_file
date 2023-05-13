import java.util.*;
public class First_non_repeating {
    public static void nonRepeating(String str){
        int count[]=new int[26];
        //'a'-'z'=
        Queue<Character>q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            //count++
            count[ch-'a']++;
            while((!q.isEmpty() && count[q.peek()-'a']>1)){
       q.remove();
            }
            if(q.isEmpty){
                System.out.println(-1+" ");
            }
            else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();
    }
  public static void main(String[] args) {
    String str="aabccxb";
   nonRepeating(str);

  }  
}
//this programme is okk
