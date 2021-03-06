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

package com.clustercontrol.monitor.bean;

import com.clustercontrol.util.Messages;

/**
 * イベント情報の確認状態の定義を定数として格納するクラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConfirmConstant {
	/** 確認（種別）。 */
	public static final int TYPE_CONFIRMED = 1;

	/** 未確認（種別）。 */
	public static final int TYPE_UNCONFIRMED = 0;

	/** 確認と未確認 */
	public static final int TYPE_ALL = -1;

	/** 確認（文字列）。 */
	public static final String STRING_CONFIRMED = Messages.getString("monitor.confirmed");

	/** 未確認（文字列）。 */
	public static final String STRING_UNCONFIRMED = Messages.getString("monitor.unconfirmed");


	/** 確認（真偽）。 */
	public static final boolean BOOLEAN_CONFIRMED = true;

	/** 未確認（真偽）。 */
	public static final boolean BOOLEAN_UNCONFIRMED = false;

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_CONFIRMED) {
			return STRING_CONFIRMED;
		} else if (type == TYPE_UNCONFIRMED) {
			return STRING_UNCONFIRMED;
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
		if (string.equals(STRING_CONFIRMED)) {
			return TYPE_CONFIRMED;
		} else if (string.equals(STRING_UNCONFIRMED)) {
			return TYPE_UNCONFIRMED;
		}
		return TYPE_ALL;
	}

	/**
	 * 種別から真偽に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 真偽
	 */
	public static boolean typeToBoolean(int type) {
		if (type == TYPE_CONFIRMED) {
			return BOOLEAN_CONFIRMED;
		} else if (type == TYPE_UNCONFIRMED) {
			return BOOLEAN_UNCONFIRMED;
		}
		return false;
	}

	/**
	 * 真偽から種別に変換します。<BR>
	 * @param bool 真偽
	 * @return 種別
	 */
	public static int booleanToType(boolean bool) {
		if (bool == BOOLEAN_CONFIRMED) {
			return TYPE_CONFIRMED;
		} else if (bool == BOOLEAN_UNCONFIRMED) {
			return TYPE_UNCONFIRMED;
		}
		return TYPE_ALL;
	}
}