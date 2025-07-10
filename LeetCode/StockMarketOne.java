package LeetCode;

public class StockMarketOne {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int result = stockMarketProfit(prices);
        System.out.println(result);
    }

    public static int stockMarketProfit(int[] prices) {
        int length = prices.length;
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy >= profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
