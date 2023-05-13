import java.util.*;
public class Fractional_knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        //for sort ratio
        double ratio[][]=new double[val.length][2];
        //0th col=origianal idx; 1 st col=ratio
        for(int i=0;i<val.length;i++){
            ratio[1][0]=i;
            //store the index
            ratio[i][1]=val[i]/(double)weight[i];

        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        //sort in assecding order on ratio basis
        int capacity=w;
            int finalValue=0;

        for(int i=ratio.length-1;i>=0;i--){
            //desending order
           int idx=(int)ratio[i][0];
           //store the idex number
           if(capacity>=weight[idx]){
            finalValue=finalValue+val[idx];
            capacity=capacity-weight[idx];
           }
           else{
            finalValue+=capacity*ratio[i][1];
            capacity=0;
            break;
           }


        }
        System.out.println("my finalValue is="+ finalValue);
    }
}
