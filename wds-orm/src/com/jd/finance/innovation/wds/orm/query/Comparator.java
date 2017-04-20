package com.jd.finance.innovation.wds.orm.query;

import java.io.Serializable;

/**
 * Created by chenminghe on 2017/4/20.
 */
public interface Comparator extends Serializable {

	LogicalOperator DEFAULT_LOGICAL_OPERATOR = LogicalOperator.AND;

	LogicalOperator getLogicalOperator();

	String getName();

	void setName(String var1);

	String getExpression();
}
