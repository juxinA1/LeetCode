package com.LeetCode.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution0001 {
	public int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		Map<Integer, Integer> map = new HashMap<>(len - 1);
		for (int i = 0; i < len; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}
		return new int[0];
	}	
}
