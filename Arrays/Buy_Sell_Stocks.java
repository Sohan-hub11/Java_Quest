//Buy and Sell Stocks -- To Calculate the Maximum Profit.

package Arrays;

public class Buy_Sell_Stocks {
    static int profit_amount(int[] price){
        int buy_price = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i< price.length; i++){
            if(buy_price < price[i]){
                int profit = price[i] - buy_price;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buy_price = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(profit_amount(prices));
    }
}
