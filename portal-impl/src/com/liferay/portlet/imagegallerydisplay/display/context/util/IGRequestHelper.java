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

package com.liferay.portlet.imagegallerydisplay.display.context.util;

import com.liferay.portlet.documentlibrary.display.context.util.DLRequestHelper;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Iván Zaera
 */
public class IGRequestHelper extends DLRequestHelper {

	public IGRequestHelper(HttpServletRequest request) {
		super(request);
	}

}