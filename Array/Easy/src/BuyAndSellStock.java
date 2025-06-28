public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1};
        System.out.println(maxProfit(arr)); // Output should be 2
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0]; // Start with first element
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
