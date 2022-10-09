package com.LeetCode.solution0870;

import java.util.Arrays;

public class Solution0870 {
	public int[] advantageCount(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		int[] nums2Clone = nums2.clone();
		Arrays.sort(nums2);
		
		int maxCount = 0;
		int maxI = 0;
		int len = nums1.length;
		for (int i = 0; i < len; i++) {
			int tempCount = 0;
			for(int j = 0; j < len - i; j++) {
				if (nums1[i + j] > nums2[j]) {
					tempCount++;
				}
			}
			if (tempCount > maxCount) {
				maxCount = tempCount;
				maxI = i;
			}
		}
		
		int[] nums1New = new int[len];
		int minNum = nums2[0] - 1;
		for (int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if (nums2Clone[i] == nums2[j]) {
					int m = maxI + j >= len ? maxI + j - len : maxI + j;
					nums1New[i] = nums1[m];
					nums2[j] = minNum;
					break;
				}
			}
		}
		
		return nums1New;
	}
}
