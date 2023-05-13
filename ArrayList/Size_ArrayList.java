import java.util.ArrayList;
public class Size_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        //here list .size is not a property like array.length
        //here it is a method or function
        //print the full ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
