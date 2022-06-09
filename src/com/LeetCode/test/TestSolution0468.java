package com.LeetCode.test;

import com.LeetCode.solution.Solution0468;

public class TestSolution0468 {

	public static void main(String[] args) {

		Solution0468 solution468 = new Solution0468();

		// String[] arrIp = { "172.16.254.1", "192.168.1.0", "192.168.01.1",
		// "192.168.1.00", "192.168@1.1", "256.256.256.256",
		// "2001:0db8:85a3:0000:0000:8a2e:0370:7334",
		// "2001:db8:85a3:0:0:8A2E:0370:7334",
		// "2001:0db8:85a3::8A2E:037j:7334", "02001:0db8:85a3:0000:0000:8a2e:0370:7334",
		// "2001:0db8:85a3:0:0:8A2E:0370:7334:"};
		String[] arrIp = { "2001:0db8:85a3:0:0:8A2E:0370:7334:" };

		for (String queryIP : arrIp) {
			String result1 = solution468.validIPAddress(queryIP);
			System.out.println(queryIP + ":" + result1);
		}

	}

}
