import java.util.ArrayList;
public class Contain_water {
    public static int  containWater(ArrayList<Integer>height){
        //brute -force approach
        
        int maximum_water=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                // i2-i1
                int width=j-i;
                int current_water=ht*width;
                maximum_water=Math.max(current_water,maximum_water);

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
        System.out.println("maximum water contain is = " + containWater(height));
        


    }
}
