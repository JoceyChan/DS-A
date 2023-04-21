package leetcode.buyAndSellStock;

public class Main {
    public static void main(String[] args){
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        // bruteForce(prices);
        optimizedSolution(prices);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int bruteForce(int[] prices){
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static int optimizedSolution(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int diff = prices[i] - minPrice;
                // System.out.println(diff);
                if(diff > maxProfit){
                    maxProfit = diff;
                }
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
}
