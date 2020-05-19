package com.mejustdoit.zuochengyun;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2019-08-20 12:33
 * @Version 1.0
 **/
public class LongestCommonPrefix_14 {

  public static void main(String[] args) {
    int[] nums = {};
    System.out.println(expectNumber(nums));

  }
  public static int expectNumber(int[] scores) {
    if(scores.length <= 1){
      return scores.length;
    }
    Arrays.sort(scores);
    int res = 1;
    for(int i = 1 ; i< scores.length; i++){
      if(scores[i] != scores[i - 1]){
        res++;
      }
    }
  return res;
  }
}
