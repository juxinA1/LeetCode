package com.LeetCode.solution1694;

public class Solution1694 {
	public String reformatNumber(String number) {
		String result = "";

		char[] chArr = number.toCharArray();
		int numCount = 0;
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ' ' || chArr[i] == '-') {
				continue;
			} else {
				numCount++;
			}

			result += chArr[i];
			if (numCount % 3 == 0) {
				result += ("-");
			}
		}

		int len = result.length();
		if (len >= 4) {
			if ("-".equals(result.substring(len - 1, len))) {
				result = result.substring(0, len - 1);
			} else if ("-".equals(result.substring(len - 2, len - 1))) {
				result = result.substring(0, len - 3) + "-" + result.substring(len - 3, len - 2)
						+ result.substring(len - 1, len);
			}
		}

		return result;
	}

}
