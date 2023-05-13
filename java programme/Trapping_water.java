import java.util.*;
public class Trapping_water {
    public static int  trapped_water(int height[]){
        //calculate left max boundary;
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],height[i-1]);
        }
        //calculate rightMax boundary
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],height[i+1]);

        }
        //loop calculate total water
        int total_trapped_water=0;
        for(int i=0;i<height.length;i++){
            //calculate water level;
            int water_level=Math.min(leftMax[i],rightMax[i]);
            //trapped water
            total_trapped_water+=water_level-height[i];
        }
        return total_trapped_water;


    }


     public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        //System.out.println(height);
        System.out.println(1);

    }
}

    

