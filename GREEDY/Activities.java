import java.util.*;
public class Activities{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        //count the added total activities
        count=1;
        //1 activitity always add
        list.add(0);
        int lastEnd=end[0];
        //last end save the value of resently end activities work
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){

                list.add(i);
                count++;
                lastEnd=end[i];
                //lastEnd update;
            }


        }
        System.out.println("total activity are "+count);
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
System.out.println();
    }
}