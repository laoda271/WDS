package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class GroupComparator extends LogicalComparator {

	private static final long serialVersionUID = -1934266794265246144L;

	public static final String START = "(";
	public static final String END = ")";

	private boolean start;

	public boolean isStart() {
		return this.start;
	}

	public GroupComparator(boolean start, LogicalOperator lo) {
		super("",lo);
		this.start = start;
	}

	public String getExpression() {
		return this.start?"(":")";
	}
}
