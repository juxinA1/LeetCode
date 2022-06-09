package com.LeetCode.solution;

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

		// ��֤�Ƿ�ʱIPv4
		String[] arrayIPv4 = queryIP.split("\\.", -1);
		if (arrayIPv4.length == 4) {
			return arrayIPv4;
		}

		// ��֤�Ƿ�ʱIPv6
		String[] arrayIPv6 = queryIP.split("\\:", -1);
		if (arrayIPv6.length == 8) {
			return arrayIPv6;
		}

		return new String[0];
	}

	/**
	 * ��֤IPv4�Ƿ���ȷ
	 * 
	 * @param arrayIP
	 *            ipv4�ַ���
	 * @return true/false
	 */
	private boolean checkIPv4(String[] arrayIP) {
		for (int i = 0; i < arrayIP.length; i++) {
			String ipv4 = arrayIP[i];
			// Xi�ǿ�
			// Xi����λ����ʱ����һλ����
			// ���ϵĳ��ϣ�IPv4��Ч
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
	 * ��֤IPv6�Ƿ���ȷ
	 * 
	 * @param arrayIP
	 *            ipv6�ַ���
	 * @return true/false
	 */
	private boolean checkIPv6(String[] arrayIP) {
		for (int i = 0; i < arrayIP.length; i++) {
			String ipv6 = arrayIP[i];
			// Xi�ǿ�
			// Xi����λ����ʱ
			// ���ϵĳ��ϣ�IPv6��Ч
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
