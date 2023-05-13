import java.util.*;
public class Anagram {
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);   //ch add if already exit then increase the frequence

        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                //ch already exit in map
                if(map.get(ch)==1){
                    //if the frequence is 1 then remove it
                    map.remove(ch);
                }
                else{
                    //if frequen bigger then 1 decrease it then put it
                    map.put(ch,map.get(ch)-1);
                }
            }
            //if the ch is not exit
            //this character is the first time in the map
            else{
                 return false;
            }
        }
        return map.isEmpty();
        //if isEmpty true then it is true;
        //or false

    }
    public static void main(String[] args) {
        // String s="race";
        // String t="care";
        String s="tulip";
         String t="lipid";
        
        System.out.println(isAnagram(s,t));
    }
    
}
