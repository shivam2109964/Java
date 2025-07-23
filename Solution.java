
class Solution {
    public static int coinsCombinations(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // base case: one way to make 0 amount (using no coins)

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinsCombinations(4, new int[]{1, 2}));       // → 4
        System.out.println(coinsCombinations(10, new int[]{5, 2, 3}));   // → 4
        System.out.println(coinsCombinations(11, new int[]{5, 7}));      // → 0
    }
}