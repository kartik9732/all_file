import java.util.*;
public class Practice_question1 {
    
    public static void main(String[] args) {
        int array[][] = { {4,7,8},
                        {8,8,7} };
                        
        int countOf7=0;
            for(int row=0;row<array.length;row++){
                for(int col=0;col<array[0].length;col++){
                    if(array[row][col]==7){
                        countOf7++;

                    }
                }
            }
            System.out.println("the number of 7 present in array is " + countOf7);
        }
    }
    

