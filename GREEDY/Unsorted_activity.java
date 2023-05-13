import java.util.*;
public class Unsorted_activity {
    
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //sorting 
        int activities[][]=new int[start.length][3];
        //start.length=N;[3]=index,start,end
        for(int i=0;i<start.length;i++){
            activities[i][0]=i; //store the index value
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        //lamda function
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        //sort base on end function=o[2];
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        //count the added total activities
        count=1;
        //1 activitity always add
        list.add(activities[0][0]);
        //0 th activities er 0 th index

        int lastEnd=activities[0][2];
        //last end save the value of resently end activities work
        for(int i=1;i<end.length;i++){
            //here actually end.length=N;
            if(activities[i][1]>=lastEnd){

                list.add(activities[i][0]);
                count++;
                lastEnd=activities[i][2]; 

                //lastEnd update;
            }


        }
        System.out.println("total activity are="+count);
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
System.out.println();
    }
}

