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

package com.clustercontrol.notify.bean;

import com.clustercontrol.util.Messages;

/**
 * 抑制間隔の定義を定数として格納するクラス<BR>
 *
 * @version 2.1.0
 * @since 1.0.0
 */
public class RenotifyTypeConstant {
	/** 常に通知する（種別）。 */
	public static final int TYPE_ALWAYS_NOTIFY = 0;

	/** 期間で抑制する（分単位）（種別）。 */
	public static final int TYPE_PERIOD = 1;

	/** 再通知しない（種別）。 */
	public static final int TYPE_NO_NOTIFY = 2;

	/** 常に通知する（文字列）。 */
	public static final String STRING_ALWAYS_NOTIFY = Messages.getString("suppress.no");

	/** 期間で抑制する（分単位）（文字列）。 */
	public static final String STRING_PERIOD = Messages.getString("suppress.by.time.interval");

	/** 再通知しない（文字列）。 */
	public static final String STRING_NO_NOTIFY = Messages.getString("suppress.always");

	/**
	 * 種別から文字列に変換します。<BR>
	 *
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_ALWAYS_NOTIFY) {
			return STRING_ALWAYS_NOTIFY;
		} else if (type == TYPE_PERIOD) {
			return STRING_PERIOD;
		} else if (type == TYPE_NO_NOTIFY) {
			return STRING_NO_NOTIFY;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。<BR>
	 * @param string 文字列
	 * @return 種別
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_ALWAYS_NOTIFY)) {
			return TYPE_ALWAYS_NOTIFY;
		} else if (string.equals(STRING_PERIOD)) {
			return TYPE_PERIOD;
		} else if (string.equals(STRING_NO_NOTIFY)) {
			return TYPE_NO_NOTIFY;
		}
		return -1;
	}
}