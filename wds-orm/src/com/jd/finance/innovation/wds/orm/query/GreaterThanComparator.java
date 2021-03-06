package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class GreaterThanComparator extends SingleComparator {

	private static final long serialVersionUID = -2458138095707350473L;
	private boolean include;

	public GreaterThanComparator(){
		super(null,null,null);
	}

	public GreaterThanComparator(String name, LogicalOperator lo, Object value) {
		super(name, lo, value);
	}

	public GreaterThanComparator(String name, Object value, boolean include, LogicalOperator lo) {
		super(name, lo, value);
		this.include = include;
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		} else if(value == null) {
			throw new IllegalArgumentException("value can not be null");
		}
	}

	public String getExpression() {
		return this.include?"#{name}>=#{value}":"#{name}>#{value}";
	}
}
