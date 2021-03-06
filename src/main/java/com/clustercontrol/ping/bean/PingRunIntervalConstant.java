/*

Copyright (C) 2006 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
useful, but WITHOUT ANY WARRANTY; without even the implied
warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.ping.bean;

import com.clustercontrol.util.Messages;

/**
 * ping実行間隔の定義を定数として格納するクラス<BR>
 * 
 * @version 2.0.0
 * @since 2.0.0
 */
public class PingRunIntervalConstant {

	/** 1秒（種別）。 */
	public static final int TYPE_SEC_01 = 1000;

	/** 2秒（種別）。 */
	public static final int TYPE_SEC_02 = 2000;

	/** 5秒（種別）。 */
	public static final int TYPE_SEC_05 = 5000;


	/** 1秒（文字列）。 */
	public static final String STRING_SEC_01 = TYPE_SEC_01/1000 + Messages.getString("second");

	/** 2秒（文字列）。 */
	public static final String STRING_SEC_02 = TYPE_SEC_02/1000 + Messages.getString("second");

	/** 5秒（文字列）。 */
	public static final String STRING_SEC_05 = TYPE_SEC_05/1000 + Messages.getString("second");

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_SEC_01) {
			return STRING_SEC_01;
		} else if (type == TYPE_SEC_02) {
			return STRING_SEC_02;
		} else if (type == TYPE_SEC_05) {
			return STRING_SEC_05;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。<BR>
	 * 
	 * @param string 文字列
	 * @return 種別
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_SEC_01)) {
			return TYPE_SEC_01;
		} else if (string.equals(STRING_SEC_02)) {
			return TYPE_SEC_02;
		} else if (string.equals(STRING_SEC_05)) {
			return TYPE_SEC_05;
		}
		return -1;
	}
}