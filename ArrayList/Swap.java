import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer>list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int index1=1;
        int index2=3;
        // here index1=value 2
        //index2=value4;
        System.out.println(list);
        swap(list,index1,index2);
        System.out.println(list);
    }
}
