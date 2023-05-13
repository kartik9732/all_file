import java.util.ArrayList;
public class MaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(1);
        int max=Integer.MIN_VALUE;
        //time complexity O(n)

        for(int i=0;i<list.size();i++){
    //         if(list.get(i)>max){
    //         max=list.get(i);
   
    //     }
    // }
    max=Math.max(max,list.get(i));
        }
        System.out.println("maximum element is max="+ max);

    }
    

}
