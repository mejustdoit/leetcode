package com.mejustdoit.zuochengyun;

/**
 * @Description 矩阵次方，只能是方阵
 * @Author dingshitao
 * @Date 2020-01-20 17:31
 * @Version 1.0
 **/
public class MatrixPower {

  public static int[][] getMatrixPower(int[][] m, int p){
    int row = m.length;
    int line = m[0].length;
    int[][] res = new int[row][line];
    int[][] tmp = m;
    for(int i = 0; i < row; i++){
      res[i][i] = 1;
    }
   for(; p > 0; p >>= 1){
     if((p & 1) > 0){
       res = MatrixMulti.getMatrixMultiRes(res, tmp);
     }
     tmp = MatrixMulti.getMatrixMultiRes(tmp, tmp);
   }
    return res;
  }

  public static void main(String[] args) {
    int[][] p = {{1,1},{1,2}};
    int[][] res = getMatrixPower(p,3);

    for(int i = 0; i < p.length; i++){
      System.out.println();
      for(int j = 0; j < p.length; j++){
        System.out.print(res[i][j] + " ");
      }
    }
  }

}
