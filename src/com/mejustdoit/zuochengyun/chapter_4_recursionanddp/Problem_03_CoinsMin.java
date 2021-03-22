package com.mejustdoit.zuochengyun.chapter_4_recursionanddp;

public class Problem_03_CoinsMin {
    public static void main(String[] args) {
        int[] arr1 = {100, 20, 5, 10, 2, 50, 1};
        int aim1 = 17019;
        System.out.println(minCoins1(arr1, aim1));
//        System.out.println(minCoins2(arr1, aim1));

        int[] arr2 = {10, 100, 2, 5, 5, 5, 10, 1, 1, 1, 2, 100};
        int aim2 = 223;
//        System.out.println(minCoins3(arr2, aim2));
//        System.out.println(minCoins4(arr2, aim2));

    }

    /**
     * 换钱使用最少的货币数量,其中
     *
     * @param arr1 代表货币种类，每种货币数量无限多
     * @param aim1
     * @return dp[i][j] = min(dp[i - 1][j] , dp[i][j - arr[i]] + 1)
     */
    public static int minCoins1(int[] arr1, int aim1) {
        if (arr1 == null || arr1.length == 0 || aim1 < 0) {
            return -1;
        }

        int n = arr1.length;
        int[][] dp = new int[n][aim1 + 1];
        int max = Integer.MAX_VALUE;


        for (int i = 1; i <= aim1; i++) {
            dp[0][i] = max;
            if (i >= arr1[0] && dp[0][i - arr1[0]] != max) {
                dp[0][i] = dp[0][i - arr1[0]] + 1;
            }
        }

        int res = 0;
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 1; j <= aim1; j++) {
                res = max;
                if (j >= arr1[i] && dp[i][j - arr1[i]] != max) {
                    res = dp[i][j - arr1[i]] + 1;
                }
                dp[i][j] = Math.min(res, dp[i - 1][j]);
            }

        }
        return dp[n - 1][aim1] != max ? dp[n - 1][aim1] : -1;
    }


}
