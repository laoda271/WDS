package com.jd.finance.innovation.wds.orm.query;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class BetweenComparator extends BinaryComparator {
	private static final long serialVersionUID = 9119572593640715897L;

	BetweenComparator() {
		super(null,null,null,null);
	}

	public BetweenComparator(String name, Object value1, Object value2) {
		this(name, value1, value2, (LogicalOperator)null);
	}

	public BetweenComparator(String name, Object value1, Object value2, LogicalOperator lo) {
		super(name, lo, value1, value2);
		if (name == null) {
			throw new IllegalArgumentException("name can not be null");
		} else if (value1 == null) {
			throw new IllegalArgumentException("value1 can not be null");
		} else if (value2 == null) {
			throw new IllegalArgumentException("value2 can not be null");
		}
	}

	public String getExpression() {
		return "#{name} BETWEEN #{value1} AND #{value2}";
	}
}
