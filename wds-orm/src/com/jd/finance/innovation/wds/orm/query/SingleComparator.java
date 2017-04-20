package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public abstract class SingleComparator extends LogicalComparator {
	private static final long serialVersionUID = 4706242319418118537L;
	private Object value;

	public SingleComparator(String name, LogicalOperator lo, Object value) {
		super(name, lo);
		this.value = value;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
