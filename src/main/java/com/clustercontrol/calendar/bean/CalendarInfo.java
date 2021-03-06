/*

Copyright (C) since 2009 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
 useful, but WITHOUT ANY WARRANTY; without even the implied
 warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.calendar.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlType;

/**
 * カレンダー情報のDTOです。
 * @since 0.1
 */
@XmlType(namespace = "http://calendar.ws.clustercontrol.com")
public class CalendarInfo implements Serializable
{
	private static final long serialVersionUID = 7723208627477421368L;

	private String id = null;
	private String name = null;
	private Long validTimeFrom = new Long(0);
	private Long validTimeTo = new Long(0);
	private String description = null;
	private String ownerRoleId = null;
	private String regUser = null;
	private Long regDate = new Long(0);
	private String updateUser = null;
	private Long updateDate = new Long(0);
	private ArrayList<CalendarDetailInfo> calendarDetailList =
			new ArrayList<CalendarDetailInfo>();

	public CalendarInfo(){
	}

	public CalendarInfo(String id, String name, Long validTimeFrom, Long validTimeTo, String description,
			String regUser, Long regDate, String updateUser, Long updateDate,
			ArrayList<CalendarDetailInfo> detailList){
		this.id = id;
		this.name = name;
		this.validTimeFrom = validTimeFrom;
		this.validTimeTo = validTimeTo;
		this.description = description;
		this.regUser = regUser;
		this.regDate = regDate;
		this.updateUser = updateUser;
		this.updateDate = updateDate;
		this.calendarDetailList = detailList;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setValidTimeFrom(Long validTimeFrom) {
		this.validTimeFrom = validTimeFrom;
	}
	public Long getValidTimeFrom() {
		return validTimeFrom;
	}
	public void setValidTimeTo(Long validTimeTo) {
		this.validTimeTo = validTimeTo;
	}
	public Long getValidTimeTo() {
		return validTimeTo;
	}
	public void setDescription(String deescription) {
		this.description = deescription;
	}
	public String getDescription() {
		return description;
	}
	public void setOwnerRoleId(String ownerRoleId) {
		this.ownerRoleId = ownerRoleId;
	}
	public String getOwnerRoleId() {
		return ownerRoleId;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegDate(Long regDate) {
		this.regDate = regDate;
	}
	public Long getRegDate() {
		return regDate;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateDate(Long updateDate) {
		this.updateDate = updateDate;
	}
	public Long getUpdateDate() {
		return updateDate;
	}

	public ArrayList<CalendarDetailInfo> getCalendarDetailList() {
		return calendarDetailList;
	}

	public void setCalendarDetailList(
			ArrayList<CalendarDetailInfo> calendarDetailList) {
		this.calendarDetailList = calendarDetailList;
	}
	@Override
	public String toString() {
		return "CalendarInfo [" +
				"id=" + id +
				", name=" + name +
				", validTimeFrom=" + validTimeFrom +
				", validTimeTo=" + validTimeTo +
				", description=" + description +
				", regUser=" + regUser +
				", regDate=" + regDate +
				", updateUser=" + updateUser +
				", updateDate=" + updateDate +
				", calendarDetailList=" + calendarDetailList +
				", detail_size=" + calendarDetailList.size() + "]";
	}



}
