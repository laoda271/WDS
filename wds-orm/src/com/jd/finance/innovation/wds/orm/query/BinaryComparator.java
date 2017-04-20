package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public abstract class BinaryComparator extends LogicalComparator {
	private static final long serialVersionUID = 7231130462994137544L;
	private Object value1;
	private Object value2;

	public BinaryComparator(String name, LogicalOperator lo, Object value1, Object value2) {
		super(name, lo);
		this.value1 = value1;
		this.value2 = value2;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Object getValue1() {
		return value1;
	}

	public void setValue1(Object value1) {
		this.value1 = value1;
	}

	public Object getValue2() {
		return value2;
	}

	public void setValue2(Object value2) {
		this.value2 = value2;
	}
}
