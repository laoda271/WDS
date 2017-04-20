package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class LikeComparator extends SingleComparator {

	private static final long serialVersionUID = -968800793541648372L;
	private boolean reverse;

	public LikeComparator(){
		super(null,null,null);
	}

	public LikeComparator(String name, Object value, boolean reverse) {
		this(name, value, reverse, (LogicalOperator)null);
	}

	public LikeComparator(String name, Object value, LogicalOperator lo) {
		this(name, value, false, lo);
	}

	public LikeComparator(String name, Object value, boolean reverse, LogicalOperator lo) {
		super(name, lo, value);
		this.reverse = reverse;
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		} else if(value == null) {
			throw new IllegalArgumentException("value can not be null");
		}
	}

	public String getExpression() {
		return this.reverse?"#{name} NOT LIKE #{value}":"#{name} LIKE #{value}";
	}
}
