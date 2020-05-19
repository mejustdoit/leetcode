package com.mejustdoit.zuochengyun;

import java.util.logging.Logger;

/**
 * @Description  两个矩阵相乘
 * @Author dingshitao
 * @Date 2020-01-20 16:08
 * @Version 1.0
 **/
public class MatrixMulti {

  public static int[][] getMatrixMultiRes(int[][] p, int[][] q){

    if(p[0].length != q.length){
      System.out.println("矩阵不能相乘");
      return null;
    }
    int row = p.length;
    int line = q[0].length;
    int[][] res = new int[row][line];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < line; j++){
        for(int k = 0; k < row; k++){
          res[i][j] +=  p[i][k] * q[k][j];
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[][] p = {{1,1,3},{1,2,2}};
    int[][] q = {{1,0,0,3},{1,4,2,2},{3,2,1,5}};
    int row = p.length;
    int line = q[0].length;
    int[][] res = getMatrixMultiRes(p,q);

    for(int i = 0; i < row; i++){
      System.out.println();
      for(int j = 0; j < line; j++){
        System.out.print(res[i][j] + " ");
      }
    }
  }
}
