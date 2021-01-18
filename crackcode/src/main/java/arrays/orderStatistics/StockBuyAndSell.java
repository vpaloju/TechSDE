package arrays.orderStatistics;

public class StockBuyAndSell {

  public static void main(String[] args) {
    int[] prices = new int[]{100, 180, 260, 310,
      40, 535, 695};
    System.out.println(getMaxProfit(prices));

  }

  public static int getMaxProfit(int[] prices) {
    int n = prices.length;
    int cost = 0, maxCost = 0;
    if (n == 0) {
      return 0;
    }
    int minPrice = prices[0];
    for (int i = 0; i < n; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      cost = prices[i] - minPrice;
      maxCost = Math.max(cost, maxCost);
    }
    return maxCost;
  }
}
