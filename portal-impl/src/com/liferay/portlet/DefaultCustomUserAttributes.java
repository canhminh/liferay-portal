/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Randomizer;

import java.util.Map;

/**
 * <p>
 * A separate instance of this class is created every time
 * <code>renderRequest.getAttribute(PortletRequest.USER_INFO)</code> is called.
 * It is safe to cache attributes in this instance because you can assume that
 * all calls to this instance belong to the same user.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class DefaultCustomUserAttributes implements CustomUserAttributes {

	public String getValue(String name, Map<String, String> userInfo) {
		if (name == null) {
			return null;
		}

		if (_log.isDebugEnabled()) {
			String companyId = userInfo.get(UserAttributes.LIFERAY_COMPANY_ID);
			String userId = userInfo.get(UserAttributes.LIFERAY_USER_ID);

			_log.debug("Company id " + companyId);
			_log.debug("User id " + userId);
		}

		if (name.equals("user.name.random")) {
			String[] names = new String[] {"Aaa", "Bbb", "Ccc"};

			return names[Randomizer.getInstance().nextInt(3)];
		}
		else {
			return null;
		}
	}

	public Object clone() {
		return new DefaultCustomUserAttributes();
	}

	private static Log _log = LogFactoryUtil.getLog(
		DefaultCustomUserAttributes.class);

}