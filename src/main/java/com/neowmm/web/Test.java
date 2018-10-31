package com.neowmm.web;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int max = 0,len = 0;
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
				len++;
				max = len>max?len:max;
			}else {
				i = map.get(s.charAt(i));
				map.clear();
				len = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(" "));
	}

}
