package com.mejustdoit.leetcode.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        double median = 0.0;
        ArrayList list = new ArrayList(2);

        if(length == 0 ){
            return median;
        }

        if(nums1.length == 0){
            if(getMedianNum(length)){
               median =  (nums2[length / 2] + nums2[(length - 1) / 2]) / 2.0;
            }else{
                median =  (nums2[length / 2]) / 2.0;
            }
            return median;
        }

        if(nums2.length == 0){
            if(getMedianNum(length)){
                median =  (nums1[length / 2] + nums1[(length - 1) / 2]) / 2.0;
            }else{
                median =  (nums1[length / 2]) / 2.0;
            }
            return median;
        }

        double medianNums1 = getMedian(nums1);
        double medianNums2 = getMedian(nums2);

        return median;

    }
    public  static Boolean getMedianNum(int length){
        boolean res = false;
        if(length % 2 == 0){
            res = true;
        }
        return res;
    }

    public static Double getMedian(int[] nums1){
        if(getMedianNum(nums1.length)){
            return (nums1[nums1.length / 2] + nums1[(nums1.length - 1) / 2]) / 2.0;
        }else {
            return  nums1[nums1.length / 2] / 1.0;
        }
    }


}
