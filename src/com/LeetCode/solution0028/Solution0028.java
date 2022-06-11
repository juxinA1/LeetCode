package com.LeetCode.solution0028;

/**
 * 
 * @author Administrator 
 * 实现 strStr()
 * 
 */
public class Solution0028 {

	public int strStr(String haystack, String needle) {
		
		if (haystack == null || haystack.isEmpty()) {
			return -1;
		}
		
		if (needle == null || needle.isEmpty()) {
			return 0;
		}
		
		int len = needle.length();
		for (int i = 0; i < haystack.length() - len + 1; i++) {
			String s =  haystack.substring(i, i + len);
			if (s.equals(needle)) {
				return i;
			}
		}
		return -1;
    }
}
