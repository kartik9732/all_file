import java.util.ArrayList;

public class Contain_water_pointer {
    public static int maxWater(ArrayList<Integer>height){
        int maximum_water=0;
        //left pointer
        int lp=0;
        //right pointer

        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int current_water=ht*width;
            maximum_water=Math.max(maximum_water,current_water);
                //update the pointer
                if(height.get(lp)<height.get(rp)){
                    lp++;
                }
                else{
                    rp--;
                }

            
        }
        return maximum_water;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        //1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("maximum water= "+ maxWater(height));
    }
}
