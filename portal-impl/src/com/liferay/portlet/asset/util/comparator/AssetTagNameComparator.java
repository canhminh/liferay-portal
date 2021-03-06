/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.asset.util.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portlet.asset.model.AssetTag;

/**
 * @author Juan Fernández
 */
public class AssetTagNameComparator extends OrderByComparator<AssetTag> {

	public static final String ORDER_BY_ASC = "AssetTag.name ASC";

	public static final String ORDER_BY_DESC = "AssetTag.name DESC";

	public static final String[] ORDER_BY_FIELDS = {"name"};

	public AssetTagNameComparator() {
		this(true, false);
	}

	public AssetTagNameComparator(boolean ascending, boolean caseSensitive) {
		_ascending = ascending;
		_caseSensitive = caseSensitive;
	}

	@Override
	public int compare(AssetTag assetTag1, AssetTag assetTag2) {
		String name1 = assetTag1.getName();
		String name2 = assetTag2.getName();

		int value = 0;

		if (_caseSensitive) {
			value = name1.compareTo(name2);
		}
		else {
			value = name1.compareToIgnoreCase(name2);
		}

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private final boolean _ascending;
	private final boolean _caseSensitive;

}