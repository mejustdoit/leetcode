package com.mejustdoit.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/19 下午8:49
 * @Version 1.0
 **/
public class ThreeSum15 {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> list = threeSum(nums);
		for (List<Integer> tmp: list) {
			for(Integer num : tmp){
				System.out.print(num + "");
			}
			System.out.println();
		}

	}
	public static List<List<Integer>> threeSum(int[] nums) {
		if(nums.length < 3){
			return null;
		}
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 1; i < nums.length - 1; i++){
			int l = 0;
			int r = nums.length - 1;
			while(l < r ){
				if( l >= i || r <= i){
					break;
				}
				while (l > 0 && nums[l] == nums[l - 1] && l < i){
					l++;
				}
				while((r < nums.length - 1 && nums[r] == nums[r + 1]) && r > i ){
					r--;
				}
				if(nums[i] + nums[l] + nums[r] == 0 && i > l && i < r){
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[l]);
					list.add(nums[i]);
					list.add(nums[r]);
					res.add(list);
				}
				l = nums[i] + nums[l] + nums[r] < 0  ? l + 1 : l;
				r = nums[i] + nums[l] + nums[r] > 0  ? r - 1 : r;
			}
		}
		return res;
	}
}

