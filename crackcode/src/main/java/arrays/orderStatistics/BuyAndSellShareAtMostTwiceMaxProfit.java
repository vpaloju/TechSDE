package arrays.orderStatistics;

/**
 * In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction can only start after the first one is complete (Sell->buy->sell->buy). Given stock prices throughout the day, find out the maximum profit that a share trader could have made.
 * <p>
 * Examples:
 * <p>
 * Input:   price[] = {10, 22, 5, 75, 65, 80}
 * Output:  97
 * Trader earns 97 as sum of 12, 70 and 15
 * Buy at price 10, sell at 22,
 * Buy at 5 and sell at 75,
 * Buy at 65 and sell at 80
 * <p>
 * Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
 * Output:  100
 * Trader earns 100 as sum of 28 and 72
 * Buy at price 2, sell at 30, buy at 8 and sell at 80
 * <p>
 * Input:   price[] = {100, 30, 15, 10, 8, 25, 80};
 * Output:  72
 * Buy at price 8 and sell at 80.
 * <p>
 * Input:   price[] = {90, 80, 70, 60, 50}
 * Output:  0
 * Not possible to earn.
 */
public class BuyAndSellShareAtMostTwiceMaxProfit {

  public static int maxProfit(int[] prices, int n) {
    int profits[] = new int[n];
    int max_price = prices[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      if (prices[i] > max_price) {
        max_price = prices[i];
      }
      // we can get profit[i] by taking maximum of:
      // a) previous maximum, i.e., profit[i+1]
      // b) profit by buying at price[i] and selling at max_price
      profits[i] = Math.max(profits[i + 1], max_price - prices[i]);
    }
    int min_Price = prices[0];
    for (int i = 1; i < n; i++) {
      if (prices[i] < min_Price) {
        min_Price = prices[i];
      }
      // Maximum profit is maximum of:
      // a) previous maximum, i.e., profit[i-1]
      // b) (Buy, Sell) at (min_price, price[i]) and add profit of other trans. stored in profit[i]
      profits[i] = Math.max(profits[i - 1],
        profits[i] + (prices[i] - min_Price));
    }
    return profits[n - 1];
  }

  public static void main(String[] args) {
    int price[] = {2, 30, 15, 10, 8, 25, 80};
    int n = price.length;
    System.out.println("Maximum Profit = "
      + maxProfit(price, n));
  }
}

