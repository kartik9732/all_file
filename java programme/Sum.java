import java.util.*;
public class Sum {
    public static int  diagonal_sum(int matrix[][]){
        int sum=0;
        //here i denote for row

        for(int i=0;i<matrix.length;i++ ){
            
            for(int j=0;j<matrix[0].length;j++){
                //primary sum
                if(i==j){
                    sum+=matrix[i][j];
                }
                //secondary sum
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        diagonal_sum(matrix);
                        
                        

        
    }
    
}
