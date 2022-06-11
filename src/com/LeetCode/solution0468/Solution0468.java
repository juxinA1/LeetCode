package com.LeetCode.solution0468;

public class Solution0468 {
	public String validIPAddress(String queryIP) {
		
		String[] ipArr = getIpType(queryIP);
		if (ipArr.length == 4) {
			if (checkIPv4(ipArr)) {
				return "IPv4";
			}
		}
		if (ipArr.length == 8) {
			if (checkIPv6(ipArr)) {
				return "IPv6";
			}
		}
		return "Neither";
	}

	private String[] getIpType(String queryIP) {

		// 验证是否是IPv4
		String[] arrayIPv4 = queryIP.split("\\.", -1);
		if (arrayIPv4.length == 4) {
			return arrayIPv4;
		}

		// 验证是否是IPv6
		String[] arrayIPv6 = queryIP.split("\\:", -1);
		if (arrayIPv6.length == 8) {
			return arrayIPv6;
		}

		return new String[0];
	}

	/**
	 * 验证IPv4是否正确
	 * 
	 * @param arrayIP
	 *            ipv4字符串
	 * @return true/false
	 */
	private boolean checkIPv4(String[] arrayIP) {
		for (int i = 0; i < arrayIP.length; i++) {
			String ipv4 = arrayIP[i];
			// Xi是空
			// Xi是两位以上时，第一位是零
			// 以上的场合，IPv4无效
			if (ipv4.isEmpty() || (ipv4.length() > 1 && "0".equals(ipv4.substring(0, 1)))) {
				return false;
			}
			try {
				int ipv4Temp = Integer.valueOf(ipv4);
				if (ipv4Temp > 255) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 验证IPv6是否真确
	 * 
	 * @param arrayIP
	 *            ipv6字符串
	 * @return true/false
	 */
	private boolean checkIPv6(String[] arrayIP) {
		for (int i = 0; i < arrayIP.length; i++) {
			String ipv6 = arrayIP[i];
			// Xi是空
			// Xi是四位以上时
			// 以上的场合，IPv6无效
			if (ipv6.isEmpty() || ipv6.length() > 4) {
				return false;
			}

			if (!ipv6.matches("[0-9a-fA-F]+")) {
				return false;
			}
		}

		return true;
	}
}
