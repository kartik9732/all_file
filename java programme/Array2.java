import java.util.*;
public class Array2 {
    
public static void main(String[] args) {
    //2d matrix
    int matrix[][]=new int[3][4];
    //row==n=3,column=m=4
    int n=matrix.length;
    int m=matrix[0].length;
    Scanner sc=new Scanner(System.in);
    //for row ellement
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            //INPUT cases
            matrix[i][j]=sc.nextInt();
        }
    }
    //output
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+ " ");

        }
        System.out.println();
    }

}
    
}
