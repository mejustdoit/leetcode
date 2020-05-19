package com.mejustdoit.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/19 下午8:51
 * @Version 1.0
 **/
public class ValidParent_20 {

	public static void main(String[] args) {
		String s = "{{{[[[((())))))}}}";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
		if(s.length() < 1 ) {
			return true;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('(',0);
		map.put('[',0);
		map.put('{',0);
		Map<Character, Character> mapCh = new HashMap<Character, Character>();
		mapCh.put(')','(');
		mapCh.put(']','[');
		mapCh.put('}','{');
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			int value = map.get(ch);
			if(map.containsKey(ch)){
				map.put(ch,value + 1);
			}else{
				if(map.get(mapCh.get(ch)) < 1){
					return false;
				}
			}
		}
		return true;
	}

}
