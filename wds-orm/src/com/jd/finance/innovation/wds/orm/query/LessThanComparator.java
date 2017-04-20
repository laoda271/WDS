package com.jd.finance.innovation.wds.orm.query;

import sun.rmi.runtime.Log;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class LessThanComparator extends SingleComparator {
	private static final long serialVersionUID = 8271828677742923212L;
	private boolean include;

	LessThanComparator(){
		super(null,null,null);
	}

	public LessThanComparator(String name, Object value, boolean include) {
		this(name,value,include,null);
	}

	public LessThanComparator(String name, Object value, LogicalOperator lo){
		this(name,value,false,lo);
	}

	public LessThanComparator(String name, Object value, boolean include, LogicalOperator lo) {
		super(name, lo, value);
		this.include = include;
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		} else if(value == null) {
			throw new IllegalArgumentException("value can not be null");
		}
	}

	public String getExpression() {
		return this.include?"#{name}<=#{value}":"#{name}<#{value}";
	}
}
