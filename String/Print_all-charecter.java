import java.util.*;
public class Print_all-charecter {
    public static void printAllLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String fullName="kartik manna";
        printAllLetter(fullname);
    }
    
}
