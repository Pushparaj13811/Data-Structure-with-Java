/* 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your
 * profit by choosing a single day to buy one stock and choosinf a different day in future to sell that stock. Return 
 * the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class buySellStocks{
    public static int buyAndSellStocks(int array[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < array.length; i++){
            if(buyPrice < array[i]){
                int profit = array[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = array[i];
            }
        }

        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print("The maximum profit which can be generated is : "+buyAndSellStocks(prices));
    }
}
