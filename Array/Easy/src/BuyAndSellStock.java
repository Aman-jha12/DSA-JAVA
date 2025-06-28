public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1};
        System.out.println(maxProfit(arr)); // Output should be 2
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0]; // Start with first element
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If we sell today, what profit do we get?
            int profit = prices[i] - minPrice;

            // Update maxProfit if this is the best so far
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update minPrice if today's price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
