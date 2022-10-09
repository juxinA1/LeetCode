package com.LeetCode.solution0870;

import java.util.Arrays;

public class Solution0870_3 {
	 public int[] advantageCount(int[] nums1, int[] nums2) {
	        int n = nums1.length;
	        Integer[] idx = new Integer[n]; // nums2索引
	        for (int i = 0; i < n; i++) {
	        	idx[i] = i;
	        }
	        Arrays.sort(nums1);
	        Arrays.sort(idx, (i, j) -> nums2[i] - nums2[j]); //根据nums2数据升序，排序nums2(索引)
	        
	        int left = 0;
	        int right = n - 1; // nums2(索引)的左右指针
	        for (int i : nums1) { // 遍历nums1
	            if (i > nums2[idx[left]]) {
	            	nums2[idx[left]] = i; // 可以满足 nums1[i] > nums2[i]
	            	left++;
	            } else {
	            	nums2[idx[right]] = i; //丢到数组最后
	            	right--;
	            }
	        }
			return nums2;
		}
}
