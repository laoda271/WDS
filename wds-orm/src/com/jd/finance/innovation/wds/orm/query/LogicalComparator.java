package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public abstract class LogicalComparator implements Comparator {
	private static final long serialVersionUID = -1829096752245944526L;
	private LogicalOperator lo;
	private String name;

	LogicalComparator(String name, LogicalOperator lo) {
		this.name = name;
		this.lo = lo;
	}

	public LogicalOperator getLogicalOperator() {
		return this.lo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
