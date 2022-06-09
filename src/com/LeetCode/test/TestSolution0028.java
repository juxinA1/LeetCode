package com.LeetCode.test;

import com.LeetCode.solution.Solution0028;

public class TestSolution0028 {

	public static void main(String[] args) {
		Solution0028 test28 = new Solution0028();
		
		System.out.println("1: " + test28.strStr("", ""));
		System.out.println("2: " + test28.strStr("aaa", ""));
		System.out.println("3: " + test28.strStr("", "aa"));
		System.out.println("4: " + test28.strStr("aaa", "aab"));
		System.out.println("5: " + test28.strStr("hello", "ll"));
		System.out.println("6: " + test28.strStr("aaaaa", "bba"));
		
	}

}
