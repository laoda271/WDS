package com.jd.finance.innovation.wds.dal.helper;

import java.lang.reflect.Field;

/**
 * Created by chenminghe on 2017/4/21.
 */
public class AnnotationHolder {
	Column column;
	PrimaryKey primaryKey;
	private Field field;
	private String ognl;

	public AnnotationHolder(Column column, PrimaryKey primaryKey, Field field, String ognl) {
		this.column = column;
		this.primaryKey = primaryKey;
		this.field = field;
		this.ognl = ognl;
	}

	public Column getColumn() {
		return column;
	}

	public void setColumn(Column column) {
		this.column = column;
	}

	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(PrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public String getOgnl() {
		return ognl;
	}

	public void setOgnl(String ognl) {
		this.ognl = ognl;
	}
}
