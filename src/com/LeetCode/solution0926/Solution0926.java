package com.LeetCode.solution0926;

public class Solution0926 {
	public int minFlipsMonoIncr(String str) {

		char[] chr = str.toCharArray();

		int minCount = chr.length;
		int oneNextIndex = 0;
		int tempCount1 = 0;

		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == '1') {
				// 出现第一个1，之后的每个0都翻转成1，所需次数。
				oneNextIndex = i + 1;
				int result = flipsMonoIncr(chr, oneNextIndex);
				minCount = Math.min(minCount, result + tempCount1);
				tempCount1++;

			}
		}
		minCount = Math.min(minCount, tempCount1);

		return minCount;

	}

	private int flipsMonoIncr(char[] chr, int oneNextIndex) {

		int result = 0;
		for (int i = oneNextIndex; i < chr.length; i++) {

			// 出现第一个1，之后的每个0都翻转成1。
			if (chr[i] == '0') {
				result++;
			}
		}

		return result;
	}

}
