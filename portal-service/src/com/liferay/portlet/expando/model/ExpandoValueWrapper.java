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

package com.liferay.portlet.expando.model;

/**
 * <p>
 * This class is a wrapper for {@link ExpandoValue}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ExpandoValue
 * @generated
 */
public class ExpandoValueWrapper implements ExpandoValue {
	public ExpandoValueWrapper(ExpandoValue expandoValue) {
		_expandoValue = expandoValue;
	}

	public Class<?> getModelClass() {
		return ExpandoValue.class;
	}

	public String getModelClassName() {
		return ExpandoValue.class.getName();
	}

	/**
	* Gets the primary key of this expando value.
	*
	* @return the primary key of this expando value
	*/
	public long getPrimaryKey() {
		return _expandoValue.getPrimaryKey();
	}

	/**
	* Sets the primary key of this expando value
	*
	* @param primaryKey the primary key of this expando value
	*/
	public void setPrimaryKey(long primaryKey) {
		_expandoValue.setPrimaryKey(primaryKey);
	}

	/**
	* Gets the value ID of this expando value.
	*
	* @return the value ID of this expando value
	*/
	public long getValueId() {
		return _expandoValue.getValueId();
	}

	/**
	* Sets the value ID of this expando value.
	*
	* @param valueId the value ID of this expando value
	*/
	public void setValueId(long valueId) {
		_expandoValue.setValueId(valueId);
	}

	/**
	* Gets the company ID of this expando value.
	*
	* @return the company ID of this expando value
	*/
	public long getCompanyId() {
		return _expandoValue.getCompanyId();
	}

	/**
	* Sets the company ID of this expando value.
	*
	* @param companyId the company ID of this expando value
	*/
	public void setCompanyId(long companyId) {
		_expandoValue.setCompanyId(companyId);
	}

	/**
	* Gets the table ID of this expando value.
	*
	* @return the table ID of this expando value
	*/
	public long getTableId() {
		return _expandoValue.getTableId();
	}

	/**
	* Sets the table ID of this expando value.
	*
	* @param tableId the table ID of this expando value
	*/
	public void setTableId(long tableId) {
		_expandoValue.setTableId(tableId);
	}

	/**
	* Gets the column ID of this expando value.
	*
	* @return the column ID of this expando value
	*/
	public long getColumnId() {
		return _expandoValue.getColumnId();
	}

	/**
	* Sets the column ID of this expando value.
	*
	* @param columnId the column ID of this expando value
	*/
	public void setColumnId(long columnId) {
		_expandoValue.setColumnId(columnId);
	}

	/**
	* Gets the row ID of this expando value.
	*
	* @return the row ID of this expando value
	*/
	public long getRowId() {
		return _expandoValue.getRowId();
	}

	/**
	* Sets the row ID of this expando value.
	*
	* @param rowId the row ID of this expando value
	*/
	public void setRowId(long rowId) {
		_expandoValue.setRowId(rowId);
	}

	/**
	* Gets the class name of the model instance this expando value is polymorphically associated with.
	*
	* @return the class name of the model instance this expando value is polymorphically associated with
	*/
	public java.lang.String getClassName() {
		return _expandoValue.getClassName();
	}

	/**
	* Gets the class name ID of this expando value.
	*
	* @return the class name ID of this expando value
	*/
	public long getClassNameId() {
		return _expandoValue.getClassNameId();
	}

	/**
	* Sets the class name ID of this expando value.
	*
	* @param classNameId the class name ID of this expando value
	*/
	public void setClassNameId(long classNameId) {
		_expandoValue.setClassNameId(classNameId);
	}

	/**
	* Gets the class p k of this expando value.
	*
	* @return the class p k of this expando value
	*/
	public long getClassPK() {
		return _expandoValue.getClassPK();
	}

	/**
	* Sets the class p k of this expando value.
	*
	* @param classPK the class p k of this expando value
	*/
	public void setClassPK(long classPK) {
		_expandoValue.setClassPK(classPK);
	}

	/**
	* Gets the data of this expando value.
	*
	* @return the data of this expando value
	*/
	public java.lang.String getData() {
		return _expandoValue.getData();
	}

	/**
	* Sets the data of this expando value.
	*
	* @param data the data of this expando value
	*/
	public void setData(java.lang.String data) {
		_expandoValue.setData(data);
	}

	public boolean isNew() {
		return _expandoValue.isNew();
	}

	public void setNew(boolean n) {
		_expandoValue.setNew(n);
	}

	public boolean isCachedModel() {
		return _expandoValue.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_expandoValue.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _expandoValue.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_expandoValue.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _expandoValue.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_expandoValue.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _expandoValue.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_expandoValue.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new ExpandoValueWrapper((ExpandoValue)_expandoValue.clone());
	}

	public int compareTo(
		com.liferay.portlet.expando.model.ExpandoValue expandoValue) {
		return _expandoValue.compareTo(expandoValue);
	}

	public int hashCode() {
		return _expandoValue.hashCode();
	}

	public com.liferay.portlet.expando.model.ExpandoValue toEscapedModel() {
		return new ExpandoValueWrapper(_expandoValue.toEscapedModel());
	}

	public java.lang.String toString() {
		return _expandoValue.toString();
	}

	public java.lang.String toXmlString() {
		return _expandoValue.toXmlString();
	}

	public boolean getBoolean()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getBoolean();
	}

	public boolean[] getBooleanArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getBooleanArray();
	}

	public java.util.Date getDate()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getDate();
	}

	public java.util.Date[] getDateArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getDateArray();
	}

	public double getDouble()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getDouble();
	}

	public double[] getDoubleArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getDoubleArray();
	}

	public float getFloat()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getFloat();
	}

	public float[] getFloatArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getFloatArray();
	}

	public int getInteger()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getInteger();
	}

	public int[] getIntegerArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getIntegerArray();
	}

	public long getLong()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getLong();
	}

	public long[] getLongArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getLongArray();
	}

	public short getShort()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getShort();
	}

	public short[] getShortArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getShortArray();
	}

	public java.lang.String getString()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getString();
	}

	public java.lang.String[] getStringArray()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expandoValue.getStringArray();
	}

	public void setBoolean(boolean data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setBoolean(data);
	}

	public void setBooleanArray(boolean[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setBooleanArray(data);
	}

	public void setDate(java.util.Date data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setDate(data);
	}

	public void setDateArray(java.util.Date[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setDateArray(data);
	}

	public void setDouble(double data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setDouble(data);
	}

	public void setDoubleArray(double[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setDoubleArray(data);
	}

	public void setFloat(float data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setFloat(data);
	}

	public void setFloatArray(float[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setFloatArray(data);
	}

	public void setInteger(int data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setInteger(data);
	}

	public void setIntegerArray(int[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setIntegerArray(data);
	}

	public void setLong(long data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setLong(data);
	}

	public void setLongArray(long[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setLongArray(data);
	}

	public void setShort(short data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setShort(data);
	}

	public void setShortArray(short[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setShortArray(data);
	}

	public void setString(java.lang.String data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setString(data);
	}

	public void setStringArray(java.lang.String[] data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_expandoValue.setStringArray(data);
	}

	public ExpandoValue getWrappedExpandoValue() {
		return _expandoValue;
	}

	public void resetOriginalValues() {
		_expandoValue.resetOriginalValues();
	}

	private ExpandoValue _expandoValue;
}