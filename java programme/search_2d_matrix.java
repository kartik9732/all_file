import java.util.*;
public class search_2d_matrix {
    public static boolean search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("key index is  (" + row +","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        // if the key is not present
        System.out.println("key is not present");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};    
                        int key=33; 
                        search(matrix,key);           
    
    }
}
