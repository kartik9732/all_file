import java.util.*;
public class RemoveDuplicate {
    public static void check(String s,int idx,StringBuilder sb,boolean map[]){
        //base case
        if(idx==s.length()){
            System.out.println(sb);
            return;
        }
        //work
        char currCh=s.charAt(idx);
        //jo index par hu usko nikal liya and currch te store koa diya

        if(map[currCh-'a']==true){
            //duplicate detect call the next index
          check(s,idx+1,sb,map);
        }
        else{
            //this is the first
            map[currCh-'a']=true;
            check(s,idx+1,sb.append(currCh),map);
        }
    }
   
    public static void main(String[] args) {
        String s="apnacollege";
        check(s,0,new StringBuilder(""),new boolean[26]);
    }
}
