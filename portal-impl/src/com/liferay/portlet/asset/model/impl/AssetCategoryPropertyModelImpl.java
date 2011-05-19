/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.asset.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.asset.model.AssetCategoryProperty;
import com.liferay.portlet.asset.model.AssetCategoryPropertyModel;
import com.liferay.portlet.asset.model.AssetCategoryPropertySoap;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the AssetCategoryProperty service. Represents a row in the &quot;AssetCategoryProperty&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.asset.model.AssetCategoryPropertyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetCategoryPropertyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategoryPropertyImpl
 * @see com.liferay.portlet.asset.model.AssetCategoryProperty
 * @see com.liferay.portlet.asset.model.AssetCategoryPropertyModel
 * @generated
 */
@JSON(strict = true)
public class AssetCategoryPropertyModelImpl extends BaseModelImpl<AssetCategoryProperty>
	implements AssetCategoryPropertyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset category property model instance should use the {@link com.liferay.portlet.asset.model.AssetCategoryProperty} interface instead.
	 */
	public static final String TABLE_NAME = "AssetCategoryProperty";
	public static final Object[][] TABLE_COLUMNS = {
			{ "categoryPropertyId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "categoryId", Types.BIGINT },
			{ "key_", Types.VARCHAR },
			{ "value", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table AssetCategoryProperty (categoryPropertyId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,categoryId LONG,key_ VARCHAR(75) null,value VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table AssetCategoryProperty";
	public static final String ORDER_BY_JPQL = " ORDER BY assetCategoryProperty.key ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AssetCategoryProperty.key_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.asset.model.AssetCategoryProperty"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.asset.model.AssetCategoryProperty"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AssetCategoryProperty toModel(
		AssetCategoryPropertySoap soapModel) {
		AssetCategoryProperty model = new AssetCategoryPropertyImpl();

		model.setCategoryPropertyId(soapModel.getCategoryPropertyId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCategoryId(soapModel.getCategoryId());
		model.setKey(soapModel.getKey());
		model.setValue(soapModel.getValue());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AssetCategoryProperty> toModels(
		AssetCategoryPropertySoap[] soapModels) {
		List<AssetCategoryProperty> models = new ArrayList<AssetCategoryProperty>(soapModels.length);

		for (AssetCategoryPropertySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return AssetCategoryProperty.class;
	}

	public String getModelClassName() {
		return AssetCategoryProperty.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.asset.model.AssetCategoryProperty"));

	public AssetCategoryPropertyModelImpl() {
	}

	public long getPrimaryKey() {
		return _categoryPropertyId;
	}

	public void setPrimaryKey(long primaryKey) {
		setCategoryPropertyId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_categoryPropertyId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@JSON
	public long getCategoryPropertyId() {
		return _categoryPropertyId;
	}

	public void setCategoryPropertyId(long categoryPropertyId) {
		_categoryPropertyId = categoryPropertyId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		if (!_setOriginalCategoryId) {
			_setOriginalCategoryId = true;

			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public long getOriginalCategoryId() {
		return _originalCategoryId;
	}

	@JSON
	public String getKey() {
		if (_key == null) {
			return StringPool.BLANK;
		}
		else {
			return _key;
		}
	}

	public void setKey(String key) {
		if (_originalKey == null) {
			_originalKey = _key;
		}

		_key = key;
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	@JSON
	public String getValue() {
		if (_value == null) {
			return StringPool.BLANK;
		}
		else {
			return _value;
		}
	}

	public void setValue(String value) {
		_value = value;
	}

	public AssetCategoryProperty toEscapedModel() {
		if (isEscapedModel()) {
			return (AssetCategoryProperty)this;
		}
		else {
			return (AssetCategoryProperty)Proxy.newProxyInstance(AssetCategoryProperty.class.getClassLoader(),
				new Class[] { AssetCategoryProperty.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					AssetCategoryProperty.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		AssetCategoryPropertyImpl assetCategoryPropertyImpl = new AssetCategoryPropertyImpl();

		assetCategoryPropertyImpl.setCategoryPropertyId(getCategoryPropertyId());
		assetCategoryPropertyImpl.setCompanyId(getCompanyId());
		assetCategoryPropertyImpl.setUserId(getUserId());
		assetCategoryPropertyImpl.setUserName(getUserName());
		assetCategoryPropertyImpl.setCreateDate(getCreateDate());
		assetCategoryPropertyImpl.setModifiedDate(getModifiedDate());
		assetCategoryPropertyImpl.setCategoryId(getCategoryId());
		assetCategoryPropertyImpl.setKey(getKey());
		assetCategoryPropertyImpl.setValue(getValue());

		assetCategoryPropertyImpl.resetOriginalValues();

		return assetCategoryPropertyImpl;
	}

	public int compareTo(AssetCategoryProperty assetCategoryProperty) {
		int value = 0;

		value = getKey().compareTo(assetCategoryProperty.getKey());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		AssetCategoryProperty assetCategoryProperty = null;

		try {
			assetCategoryProperty = (AssetCategoryProperty)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assetCategoryProperty.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
		AssetCategoryPropertyModelImpl assetCategoryPropertyModelImpl = this;

		assetCategoryPropertyModelImpl._originalCategoryId = assetCategoryPropertyModelImpl._categoryId;

		assetCategoryPropertyModelImpl._setOriginalCategoryId = false;

		assetCategoryPropertyModelImpl._originalKey = assetCategoryPropertyModelImpl._key;
	}

	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{categoryPropertyId=");
		sb.append(getCategoryPropertyId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", value=");
		sb.append(getValue());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.asset.model.AssetCategoryProperty");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoryPropertyId</column-name><column-value><![CDATA[");
		sb.append(getCategoryPropertyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _categoryPropertyId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _categoryId;
	private long _originalCategoryId;
	private boolean _setOriginalCategoryId;
	private String _key;
	private String _originalKey;
	private String _value;
	private transient ExpandoBridge _expandoBridge;
}