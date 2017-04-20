package com.jd.finance.innovation.wds.orm.query;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class InComparator extends SingleComparator {
	private static final long serialVersionUID = -4414666207076319005L;

	private boolean reverse;

	public InComparator(){
		super(null,null,null);
	}

	public InComparator(String name, Object value) {
		this(name, value, false, (LogicalOperator)null);
	}

	public InComparator(String name, Object value, boolean reverse, LogicalOperator lo) {
		super(name, lo, value);
		this.reverse = reverse;
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		} else if(value == null) {
			throw new IllegalArgumentException("value can not be null");
		} else if(!value.getClass().isArray() && !(value instanceof Collection)) {
			throw new IllegalArgumentException("value must be array or Collection");
		} else {
			int len;
			if(value.getClass().isArray()) {
				len = Array.getLength(value);
			} else {
				len = ((Collection)value).size();
			}
			if(len == 0) {
				throw new IllegalArgumentException("collection can not be empty");
			}
		}
	}

	public String getExpression() {
		return this.reverse?"#{name} NOT IN (#{value})":"#{name} IN (#{value})";
	}
}
