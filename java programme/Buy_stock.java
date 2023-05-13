import java.util.*;
public class Buy_stock {
    public static int maximum_profit(int prices[]){
        int buy_price=Integer.MAX_VALUE;//+infinitive
        int total_profit=0;
        for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){
                //buying prices<selling prices
                int profit=prices[i]- buy_price;
                //todays profit
                total_profit=Math.max(total_profit,profit);
            }
            else{
                //buying price update
                //+infinitive/update to 7
                buy_price=prices[i];
            }
        }
        return total_profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maximum_profit(prices));
    }
    
}
