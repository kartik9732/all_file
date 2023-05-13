import java.util.*;
import java.util.ArrayList;
public class multidimentionalArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer>mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=0;i<=5;i++){
            list1.add(1*i);//1 2 3 4 5
            list2.add(2*i);//2 4 6 8 10
            list3.add(3*i);// 3 6 9 12 15
        }
            //add tp mainList all list

            mainList.add(list1);
            mainList.add(list2);
            mainList.add(list3);
            System.out.println(mainList);
        
        //print all the element
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currentList=mainList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.println(currentList.get(j));
            }


        }

    }
}
