package com.LeetCode.solution1694;

public class Solution1694_2 {
	public String reformatNumber(String number) {
		char[] chArr = number.toCharArray();
		String digits = "";
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] != ' ' && chArr[i] != '-') {
				digits += chArr[i];
			}
		}

		StringBuilder ans = new StringBuilder();
		int n = digits.length();
		for (int i = n; i > 0; i -= 3) {
			if (i > 4) {
				ans.append(digits.substring(n - i, n - i + 3)).append("-");
			} else if (i == 4) {
				ans.append(digits.substring(n - 4, n - 2)).append("-").append(digits.substring(n - 2, n));
				break;
			} else {
				ans.append(digits.substring(n - i));
				break;
			}
		}

		return ans.toString();
	}

}
