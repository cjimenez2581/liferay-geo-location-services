/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.geo.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rivetlogic.geo.model.GeoBlocks;
import com.rivetlogic.geo.model.GeoBlocksModel;
import com.rivetlogic.geo.service.persistence.GeoBlocksPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the GeoBlocks service. Represents a row in the &quot;rivetlogic_geo_GeoBlocks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rivetlogic.geo.model.GeoBlocksModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GeoBlocksImpl}.
 * </p>
 *
 * @author charles.rodriguez
 * @see GeoBlocksImpl
 * @see com.rivetlogic.geo.model.GeoBlocks
 * @see com.rivetlogic.geo.model.GeoBlocksModel
 * @generated
 */
public class GeoBlocksModelImpl extends BaseModelImpl<GeoBlocks>
	implements GeoBlocksModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a geo blocks model instance should use the {@link com.rivetlogic.geo.model.GeoBlocks} interface instead.
	 */
	public static final String TABLE_NAME = "rivetlogic_geo_GeoBlocks";
	public static final Object[][] TABLE_COLUMNS = {
			{ "geonameId", Types.BIGINT },
			{ "startIp", Types.BIGINT },
			{ "endIp", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table rivetlogic_geo_GeoBlocks (geonameId LONG not null,startIp LONG not null,endIp LONG,primary key (geonameId, startIp))";
	public static final String TABLE_SQL_DROP = "drop table rivetlogic_geo_GeoBlocks";
	public static final String ORDER_BY_JPQL = " ORDER BY geoBlocks.id.geonameId ASC, geoBlocks.id.startIp ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rivetlogic_geo_GeoBlocks.geonameId ASC, rivetlogic_geo_GeoBlocks.startIp ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rivetlogic.geo.model.GeoBlocks"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rivetlogic.geo.model.GeoBlocks"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rivetlogic.geo.model.GeoBlocks"),
			true);
	public static long ENDIP_COLUMN_BITMASK = 1L;
	public static long STARTIP_COLUMN_BITMASK = 2L;
	public static long GEONAMEID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rivetlogic.geo.model.GeoBlocks"));

	public GeoBlocksModelImpl() {
	}

	@Override
	public GeoBlocksPK getPrimaryKey() {
		return new GeoBlocksPK(_geonameId, _startIp);
	}

	@Override
	public void setPrimaryKey(GeoBlocksPK primaryKey) {
		setGeonameId(primaryKey.geonameId);
		setStartIp(primaryKey.startIp);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new GeoBlocksPK(_geonameId, _startIp);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((GeoBlocksPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return GeoBlocks.class;
	}

	@Override
	public String getModelClassName() {
		return GeoBlocks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("geonameId", getGeonameId());
		attributes.put("startIp", getStartIp());
		attributes.put("endIp", getEndIp());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long geonameId = (Long)attributes.get("geonameId");

		if (geonameId != null) {
			setGeonameId(geonameId);
		}

		Long startIp = (Long)attributes.get("startIp");

		if (startIp != null) {
			setStartIp(startIp);
		}

		Long endIp = (Long)attributes.get("endIp");

		if (endIp != null) {
			setEndIp(endIp);
		}
	}

	@Override
	public long getGeonameId() {
		return _geonameId;
	}

	@Override
	public void setGeonameId(long geonameId) {
		_geonameId = geonameId;
	}

	@Override
	public long getStartIp() {
		return _startIp;
	}

	@Override
	public void setStartIp(long startIp) {
		_columnBitmask |= STARTIP_COLUMN_BITMASK;

		if (!_setOriginalStartIp) {
			_setOriginalStartIp = true;

			_originalStartIp = _startIp;
		}

		_startIp = startIp;
	}

	public long getOriginalStartIp() {
		return _originalStartIp;
	}

	@Override
	public long getEndIp() {
		return _endIp;
	}

	@Override
	public void setEndIp(long endIp) {
		_columnBitmask |= ENDIP_COLUMN_BITMASK;

		if (!_setOriginalEndIp) {
			_setOriginalEndIp = true;

			_originalEndIp = _endIp;
		}

		_endIp = endIp;
	}

	public long getOriginalEndIp() {
		return _originalEndIp;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public GeoBlocks toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (GeoBlocks)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		GeoBlocksImpl geoBlocksImpl = new GeoBlocksImpl();

		geoBlocksImpl.setGeonameId(getGeonameId());
		geoBlocksImpl.setStartIp(getStartIp());
		geoBlocksImpl.setEndIp(getEndIp());

		geoBlocksImpl.resetOriginalValues();

		return geoBlocksImpl;
	}

	@Override
	public int compareTo(GeoBlocks geoBlocks) {
		GeoBlocksPK primaryKey = geoBlocks.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GeoBlocks)) {
			return false;
		}

		GeoBlocks geoBlocks = (GeoBlocks)obj;

		GeoBlocksPK primaryKey = geoBlocks.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		GeoBlocksModelImpl geoBlocksModelImpl = this;

		geoBlocksModelImpl._originalStartIp = geoBlocksModelImpl._startIp;

		geoBlocksModelImpl._setOriginalStartIp = false;

		geoBlocksModelImpl._originalEndIp = geoBlocksModelImpl._endIp;

		geoBlocksModelImpl._setOriginalEndIp = false;

		geoBlocksModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<GeoBlocks> toCacheModel() {
		GeoBlocksCacheModel geoBlocksCacheModel = new GeoBlocksCacheModel();

		geoBlocksCacheModel.geonameId = getGeonameId();

		geoBlocksCacheModel.startIp = getStartIp();

		geoBlocksCacheModel.endIp = getEndIp();

		return geoBlocksCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{geonameId=");
		sb.append(getGeonameId());
		sb.append(", startIp=");
		sb.append(getStartIp());
		sb.append(", endIp=");
		sb.append(getEndIp());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.geo.model.GeoBlocks");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>geonameId</column-name><column-value><![CDATA[");
		sb.append(getGeonameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startIp</column-name><column-value><![CDATA[");
		sb.append(getStartIp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endIp</column-name><column-value><![CDATA[");
		sb.append(getEndIp());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = GeoBlocks.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			GeoBlocks.class
		};
	private long _geonameId;
	private long _startIp;
	private long _originalStartIp;
	private boolean _setOriginalStartIp;
	private long _endIp;
	private long _originalEndIp;
	private boolean _setOriginalEndIp;
	private long _columnBitmask;
	private GeoBlocks _escapedModel;
}