import java.util.ArrayList;
public class Pair_sum {
    public static boolean pair(ArrayList<Integer>list,int key){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                
                int sum=list.get(i)+list.get(j);
            if(sum==key){
                return true;
           
            }
            
            }
        }
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
        int key=5;
        System.out.println(pair(list,key));
  


    }
}
