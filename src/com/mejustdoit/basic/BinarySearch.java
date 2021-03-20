package com.mejustdoit.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 4, 8, 9, 17,28,45,69};
        System.out.println(getInsertIndexWithDfs(nums, 0, nums.length - 1, 16));

    }
    public static int getInsertIndexWithDfs(int[] nums, int start, int end, int target){
        if(start > end || nums[start] >= target || nums.length == 1){
            return start;
        }
        if(nums[end] <= target){
            return end + 1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < target){
           return  getInsertIndexWithDfs(nums, mid + 1, end, target);
        }else{
            return getInsertIndexWithDfs(nums, start, mid - 1, target);
        }
    }
}
