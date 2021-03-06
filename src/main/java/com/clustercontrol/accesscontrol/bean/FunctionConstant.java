/*

Copyright (C) since 2006 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
useful, but WITHOUT ANY WARRANTY; without even the implied
warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.accesscontrol.bean;

/**
 * Hinemosのシステム権限の機能名を定数として格納するクラス<BR>
 * 
 * @version 4.0.0
 * @since 2.0.0
 */
public final class FunctionConstant {

	/** Hinemosエージェント(内部用) */
	public static final String HINEMOS_AGENT = "HinemosAgent";
	/** Hinemos HA(内部用) */
	public static final String HINEMOS_HA = "HinemosHA";
	/** Hinemos CLI(内部用) */
	public static final String HINEMOS_CLI = "HinemosCLI";

	/** リポジトリ */
	public static final String REPOSITORY = "Repository";
	/** ユーザ管理 */
	public static final String ACCESSCONTROL = "AccessControl";
	/** ジョブ管理 */
	public static final String JOBMANAGEMENT = "JobManagement";
	/** 性能管理 */
	public static final String PERFORMANCE = "Performance";
	/** 監視結果 */
	public static final String MONITOR_RESULT = "MonitorResult";
	/** 監視設定 */
	public static final String MONITOR_SETTING = "MonitorSetting";
	/** カレンダ */
	public static final String CALENDAR = "Calendar";
	/** 通知 */
	public static final String NOTIFY = "Notify";
	/** 環境構築機能 */
	public static final String INFRA = "Infra";
	/** メンテナンス(履歴情報削除, 共通設定) */
	public static final String MAINTENANCE = "Maintenance";
	/** クラウド・仮想化管理 */
	public static final String CLOUDMANAGEMENT = "CloudManagement";
	/** レポーティング */
	public static final String REPORTING = "Reporting";
}
