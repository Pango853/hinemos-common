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

package com.clustercontrol.repository.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * スコープ情報の属性名定義クラス<BR>
 *
 * @version 3.1.0
 * @since 1.0.0
 */
public class FacilityTreeAttributeConstant {
	public static final String FACILITYID = "ccFacilityId";
	public static final String TREETYPE = "ccTreeType";
	public static final String BUILTIN = "ccFacilityBuiltIn";
	public static final String SORT_VALUE="ccFacilitySortValue";

	public static final String REGISTEREFD_SCOPE="REGISTERED";
	public static final String REGISTERED_SCOPE_TEXT="Registered_Nodes";
	public static final String UNREGISTEREFD_SCOPE="UNREGISTERED";
	public static final String UNREGISTERED_SCOPE_TEXT="Unregistered_Node";

	public static final String INTERNAL_SCOPE="INTERNAL";
	public static final String INTERNAL_SCOPE_TEXT="Hinemos_Internal";

	public static final String OWNER_SCOPE="OWNER";
	
	public static final String OS_PARENT_SCOPE="OS";

	public static final String VM_SCOPE="VM";
	public static final String VM_SCOPE_TEXT="Vm_Node";
	public static final String UNALLOCATED_SCOPE="UNALLOCATED";
	public static final String UNALLOCATED_SCOPE_TEXT="Unallocated_Node";

	public static final String VALID="ccValid";
	
	private static Set<String> buildinScopeFacilityIdSet;
	
	static {
		buildinScopeFacilityIdSet = new HashSet<String>();
		buildinScopeFacilityIdSet.add(REGISTEREFD_SCOPE);
		buildinScopeFacilityIdSet.add(UNREGISTEREFD_SCOPE);
		buildinScopeFacilityIdSet.add(INTERNAL_SCOPE);
		buildinScopeFacilityIdSet.add(VM_SCOPE);
		buildinScopeFacilityIdSet.add(UNALLOCATED_SCOPE);
		buildinScopeFacilityIdSet.add(OS_PARENT_SCOPE);
	}
	
	public static Set<String> getBuiltinScopeFacilityIdSet() {
		return buildinScopeFacilityIdSet;
	}
	
	/**
	 * 組み込みスコープかどうかを判定するメソッド<br>
	 * 
	 * @param facilityId ファシリティID
	 * @return 組み込みスコープの場合はtrue, それ以外はfalse
	 */
	public static boolean isBuiltinScope(String facilityId) {
		return buildinScopeFacilityIdSet.contains(facilityId);
	}
}
