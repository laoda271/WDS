package com.jd.finance.innovation.wds.orm.query;

import com.jd.finance.innovation.wds.orm.entity.PersistableEntity;

import java.util.Arrays;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class QueryBuilder<T extends PersistableEntity> {
	protected Query query;
	private boolean startGroup;

	private QueryBuilder(Class<T> beanType) {
		if (beanType == null) {
			throw new IllegalArgumentException("bean type can not be null");
		} else {
			this.query = new StandardQuery();
			this.query.setBeanType(beanType);
		}
	}

	public static <T extends PersistableEntity> QueryBuilder<T> custom(Class<T> beanType) {
		return new QueryBuilder(beanType);
	}

	public QueryBuilder<T> andLike(String name, Object value) {
		this.query.addComparator(new LikeComparator(name, value, false, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andLike(String name, Object value, boolean reverse) {
		this.query.addComparator(new LikeComparator(name, value, reverse, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andIn(String name, Object[] value) {
		this.query.addComparator(new InComparator(name, value, false, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andIn(String name, Object[] value, boolean reverse) {
		this.query.addComparator(new InComparator(name, value, reverse, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andEquivalent(String name, Object[] value, boolean reverse) {
		this.query.addComparator(new EquivalentComparator(name, value, reverse));
		return this;
	}

	public QueryBuilder<T> andGreaterThan(String name, Object value) {
		this.query.addComparator(new GreaterThanComparator(name, value, false, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andGreaterThan(String name, Object value, boolean include) {
		this.query.addComparator(new GreaterThanComparator(name, value, include, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andLessThan(String name, Object value) {
		this.query.addComparator(new LessThanComparator(name, value, false, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andLessThan(String name, Object value, boolean include) {
		this.query.addComparator(new LessThanComparator(name, value, include, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> andBetween(String name, Object value1, Object value2) {
		this.query.addComparator(new BetweenComparator(name, value1, value2, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> orLike(String name, Object value) {
		this.query.addComparator(new LikeComparator(name, value, false, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orLike(String name, Object value, boolean reverse) {
		this.query.addComparator(new LikeComparator(name, value, reverse, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orIn(String name, Object[] value) {
		this.query.addComparator(new InComparator(name, value, false, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orIn(String name, Object[] value, boolean reverse) {
		this.query.addComparator(new InComparator(name, value, reverse, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orEquivalent(String name, Object value) {
		this.query.addComparator(new EquivalentComparator(name, value, false, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orEquivalent(String name, Object value, boolean reverse) {
		this.query.addComparator(new EquivalentComparator(name, value, reverse, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orGreaterThan(String name, Object value) {
		this.query.addComparator(new GreaterThanComparator(name, value, false, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orGreaterThan(String name, Object value, boolean include) {
		this.query.addComparator(new GreaterThanComparator(name, value, include, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orLessThan(String name, Object value) {
		this.query.addComparator(new LessThanComparator(name, value, false, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orLessThan(String name, Object value, boolean include) {
		this.query.addComparator(new LessThanComparator(name, value, include, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orBetween(String name, Object value1, Object value2) {
		this.query.addComparator(new BetweenComparator(name, value1, value2, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> orderBy(String orderField, SortDirection direction) {
		this.query.setSort(new Sort(orderField, direction));
		return this;
	}

	public QueryBuilder<T> limit(int limit) {
		this.query.setLimit(limit);
		return this;
	}

	public QueryBuilder<T> limit(int offset, int limit) {
		this.query.setLimits(offset, limit);
		return this;
	}

	public QueryBuilder<T> orGroup() {
		this.query.addComparator(new GroupComparator(true, LogicalOperator.OR));
		return this;
	}

	public QueryBuilder<T> andGroup() {
		this.query.addComparator(new GroupComparator(true, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> endGroup() {
		this.query.addComparator(new GroupComparator(false, LogicalOperator.AND));
		return this;
	}

	public QueryBuilder<T> includeFields(String... fields) {
		this.query.setIncludeFields(Arrays.asList(fields));
		return this;
	}

	public QueryBuilder<T> excludeFields(String... fields) {
		this.query.setExcludeFields(Arrays.asList(fields));
		return this;
	}

	public Query<T> build() {
		Sort sort = this.query.getSort();
		if (sort == null) {
			this.query.setSort(new Sort("id", SortDirection.DESC));
		}
		return this.query;
	}

}
