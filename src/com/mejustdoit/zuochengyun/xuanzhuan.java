package com.mejustdoit.zuochengyun;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/19 下午8:52
 * @Version 1.0
 **/
public class xuanzhuan {


	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = count++;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		rotate(a);
		System.out.println(a);
	}

	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		// transpose matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < m; j++) {
				int tmp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}
		// reverse each row
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[i][n - j - 1];
				matrix[i][n - j - 1] = tmp;
			}
		}
	}

}
