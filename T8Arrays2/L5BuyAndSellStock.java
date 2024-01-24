/*
* You are given an array prices where prices[i] is the price of a given stock on the ith day. 
* You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
* Return the maximum profit you can achieve from this transaction. 
* If you cannot achieve any profit, return 0.
* example: prices = [7,1,5,3,6,4]
* profit = 6 - 1 = 5 
*/
package T8Arrays2;

public class L5BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }

    // O(n)
    static int buyAndSellStock(int prices[]){
        int min_buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0; i < prices.length; i++){
            int sellingPrice = prices[i];
            if(min_buy_price < sellingPrice){
                // calculate and update profit
                int profit = sellingPrice - min_buy_price;
                max_profit = Math.max(max_profit, profit);
            } else{
               // updated min buying price if it is greater than today stock price
               min_buy_price = sellingPrice;  
            }
        }

        return max_profit;
    }
}
