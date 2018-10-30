package org.honor.core.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;

public class MacId {
	private static InetAddress ip;

	private static String getLocalMac() throws SocketException {
		// TODO Auto-generated method stub
		// 获取网卡，获取地址
		byte[] mac = NetworkInterface.getByInetAddress(ip).getHardwareAddress();
		// System.out.println("mac数组长度：" + mac.length);
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mac.length; i++) {
			if (i != 0) {
				// sb.append("-");
			}
			// 字节转换为整数
			int temp = mac[i] & 0xff;
			String str = Integer.toHexString(temp);
			// System.out.println("每8位:" + str);
			if (str.length() == 1) {
				sb.append("0" + str);
			} else {
				sb.append(str);
			}
		}
		String num = generate9();
		
		return sb.toString().toUpperCase() + num;
	}

	public synchronized static String generate9() {

		int n = (int) (Math.random() * 900000000) + 100000000;
		return n + "";
	}
}
