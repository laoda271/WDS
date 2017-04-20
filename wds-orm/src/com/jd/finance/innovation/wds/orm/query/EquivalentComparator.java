package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class EquivalentComparator extends SingleComparator {

	private static final long serialVersionUID = 4900813167461541625L;
	private boolean reverse;

	EquivalentComparator() {
		super(null, null, null);
	}

	public EquivalentComparator(String name, Object value) {
		this(name, value, false, (LogicalOperator)null);
	}

	public EquivalentComparator(String name, Object value, boolean reverse) {
		this(name, value, reverse, (LogicalOperator)null);
	}

	public EquivalentComparator(String name, Object value, LogicalOperator lo) {
		this(name, value, false, lo);
	}

	public EquivalentComparator(String name, Object value, boolean reverse, LogicalOperator lo) {
		super(name, lo,value);
		this.reverse = reverse;
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		} else if(value == null) {
			throw new IllegalArgumentException("value can not be null");
		}
	}

	public String getExpression() {
		return this.reverse?"#{name}!=#{value}":"#{name}=#{value}";
	}


}
