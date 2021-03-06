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

import com.clustercontrol.bean.PriorityConstant;
import com.clustercontrol.util.Messages;

/**
 * ステータス情報の存続期間の定義を定数として格納するクラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class StatusExpirationConstant {

	/** ステータス情報の状態：存続期間経過（種別）。 */
	public static final int TYPE_EXPIRATION = 10;

	/** 存続期間経過後の処理：削除（種別）。 */
	public static final int TYPE_DELETE = 11;

	/** 存続期間経過後の処理：更新（種別）。 */
	public static final int TYPE_UPDATE = 12;

	/** 存続期間経過後の更新時の重要度：危険（種別）。 */
	public static final int TYPE_CRITICAL = PriorityConstant.TYPE_CRITICAL;

	/** 存続期間経過後の更新時の重要度：警告（種別）。 */
	public static final int TYPE_WARNING = PriorityConstant.TYPE_WARNING;

	/** 存続期間経過後の更新時の重要度：通知（種別）。 */
	public static final int TYPE_INFO = PriorityConstant.TYPE_INFO;

	/** 存続期間経過後の更新時の重要度：不明（種別）。 */
	public static final int TYPE_UNKNOWN = PriorityConstant.TYPE_UNKNOWN;

	/** 存続期間経過後の更新時の重要度：なし（種別）。 */
	public static final int TYPE_NONE = PriorityConstant.TYPE_NONE;


	/** ステータス情報の状態：存続期間経過（文字列）。 */
	public static final String STRING_EXPIRATION = Messages.getString("expiration");

	/** 存続期間経過後の処理：削除（文字列）。 */
	public static final String STRING_DELETE = Messages.getString("delete");

	/** 存続期間経過後の処理：更新（文字列）。 */
	public static final String STRING_UPDATE = Messages.getString("update");

	/** 存続期間経過後の更新時の重要度：危険（文字列）。 */
	public static final String STRING_CRITICAL = PriorityConstant.STRING_CRITICAL;

	/** 存続期間経過後の更新時の重要度：警告（文字列）。 */
	public static final String STRING_WARNING = PriorityConstant.STRING_WARNING;

	/** 存続期間経過後の更新時の重要度：通知（文字列）。 */
	public static final String STRING_INFO = PriorityConstant.STRING_INFO;

	/** 存続期間経過後の更新時の重要度：不明（文字列）。 */
	public static final String STRING_UNKNOWN = PriorityConstant.STRING_UNKNOWN;

	/** 存続期間経過後の更新時の重要度：なし（文字列） */
	public static final String STRING_NONE =  PriorityConstant.STRING_NONE;


	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_DELETE) {
			return STRING_DELETE;
		} else if (type == TYPE_UPDATE) {
			return STRING_UPDATE;
		}
		return "";
	}

	/**
	 * 文文字列から種別に変換します。<BR>
	 * 
	 * @param string 文字列
	 * @return 種別
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_DELETE)) {
			return TYPE_DELETE;
		} else if (string.equals(STRING_UPDATE)) {
			return TYPE_UPDATE;
		}
		return -1;
	}
}