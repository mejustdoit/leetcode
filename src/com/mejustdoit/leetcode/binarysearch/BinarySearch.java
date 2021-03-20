package com.mejustdoit.leetcode.binarysearch;

import java.util.logging.Logger;

/**
 * 二分查找基础算法
 */
public class BinarySearch {
    static Logger LOGGER = Logger.getLogger("BinarySearch.class");

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 12, 32, 34, 38, 45, 56, 78, 98};
        System.out.println(getRes(nums, 25));
        System.out.println(getRes(nums, 45));

    }

    public static int getRes(int nums[], int res) {
        int count = 0;
        int mid, l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            count++;
            mid = l + ((r - l) >> 1);
            if (nums[mid] == res) {
                LOGGER.info("执行次数：" + count);
                return mid;
            } else if (nums[mid] < res) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        LOGGER.info("执行次数：" + count);
        return -1;
    }
}
