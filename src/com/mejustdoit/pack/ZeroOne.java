package com.mejustdoit.pack;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/19 下午8:53
 * @Version 1.0
 **/
public class ZeroOne {


	/**
	 *
	 * @param N 物品数量
	 * @param capacity 物品体积
	 * @param V 背包体积
	 * @return {@link int}
	 * @auther: shitao
	 * @date: 2020-01-02 10:04
	 * @discription 原始的未经过优化的背包
	 */
	public static int ZeroOneVN(int N, int[] capacity,int[] value, int V){
		int[][] dp = new int[N][V + 1];
		int res = 0;
		for(int i = 0; i < N; i++){
			Arrays.fill(dp[i],0);
		}

		for(int i = 1; i < N; i++){
			for(int j = 0; j <= V; j++){
				if(j >= capacity[i]){
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - capacity[i]] + value[i]);
				}else{
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return res;
	}





	/**
	 *
	 * @discription 递归解法
	 */



}

