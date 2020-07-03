package com.mejustdoit.classic;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/29 下午1:06
 * @Version 1.0
 **/
public class KMP {
	/**
	 *
	 * @param S
	 * @param P
	 * @return {@link int}
	 * @auther: shitao
	 * @date: 2020/5/29 下午1:47
	 * @discription 暴力解决，算法时间复杂度O(n*2),空间复杂度O(1)
	 */
	public static int forceBluth(String S, String P){
		int p_len = P.length();
		int s_len = S.length();
		int i = 0, j = 0;
		while(j < p_len && i < s_len){
			if(S.charAt(i) == P.charAt(j)){
				i++;
				j++;
			}else{
				i = i - j + 1;
				j = 0;
			}
		}
		if(j == p_len){
			return i - j;
		}
		return -1;
	}
	/**
	 *
	 * @param P
	 * @return {@link void}
	 * @auther: shitao
	 * @date: 2020/5/29 下午1:50
	 * @discription 获取模式串前缀数组
	 */
	public static void getNext(String P, int[] next){
		int p_len = P.length();
		int i = 0, j = -1;
		next[0] = -1;
		while( i < p_len ){
			if(j == -1 || P.charAt(i) == P.charAt(j)){
				i++;
				j++;
				next[i] = j;
			}else {
				j = next[j];
			}
		}
		return;
	}

	public static int getKMP(String S, String P, int[] next){
		int p_len = P.length();
		int s_len = S.length();
		int i = 0, j = 0;
		while(j < p_len && i < s_len){
			if(S.charAt(i) == P.charAt(j)){
				i++;
				j++;
			}else{
				j = next[j];
			}
		}
		if(j == p_len){
			return i - j;
		}
		return -1;

	}
	public static void main(String[] args) {
		String S = "frejnverreui revre freer fewwewq";
		String P = "ejnver";
		System.out.println(forceBluth(S,P));
		int[] next = new int[P.length()];


	}




}
