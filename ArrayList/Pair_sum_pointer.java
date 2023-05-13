import java.util.ArrayList;
public class Pair_sum_pointer {
    public static boolean pair(ArrayList<Integer>list,int key){
 //left pointer

        int lp=0;
        //right pointer
        int rp=list.size()-1;
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==key){
                return true;
            }
            if(sum<key){
                lp++;

            }
            else{
                rp--;
            }
        }
        //in case the key is not present in any case
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //1 2 3  4 5 6
        //it is ssorted array
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int key=50;
        System.out.println(pair(list,key));
    }
}
