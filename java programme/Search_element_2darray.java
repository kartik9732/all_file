import java.util.*;
public class Search_element_2d_array {
    public static boolean search(int matrix[i][j],int ley){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell(" +i","+" j)");
                    return true;


                }
            }
        }
        System.out.println("key not found");
        
    }
    public static void main(String[] args) {
        
    }
    
}
