package com.jd.finance.innovation.wds.orm.query;

import com.jd.finance.innovation.wds.orm.entity.PersistableEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class StandardQuery<T extends PersistableEntity>  implements Query<T>{

	private static final long serialVersionUID = -2311051078495672273L;

	private List<Comparator> comparators = new ArrayList<Comparator>();

	private int[] limits = new int[2];

	private Sort sort;

	Class<T> beanType;

	private List<String> excludeFields;

	private List<String> includeFields;

	public StandardQuery() {
	}

	@Override
	public Query<T> addComparator(Comparator comparators) {
		if(comparators != null){
			this.comparators.add(comparators);
		}
		return this;
	}

	@Override
	public Query<T> removeComparator(Comparator comparators) {
		if(comparators != null){
			this.comparators.remove(comparators);
		}
		return this;
	}

	@Override
	public Query<T> addAllComparators(List<Comparator> comparators) {
		if(comparators != null && !comparators.isEmpty()){
			this.comparators.addAll(comparators);
		}
		return this;
	}

	@Override
	public Query<T> setComparators(List<Comparator> comparators) {
		if(comparators != null){
			this.comparators = comparators;
		}
		return this;
	}

	@Override
	public List<Comparator> getComparators() {
		return this.comparators;
	}

	@Override
	public Query<T> setLimit(int limit) {
		return this.setLimits(0,limit);
	}

	@Override
	public int getLimit() {
		return this.limits[1];
	}

	@Override
	public Query<T> setLimits(int offset, int limit) {
		this.limits[0] = offset;
		this.limits[1] = limit;
		return this;
	}

	@Override
	public int[] getLimits() {
		return this.limits;
	}

	@Override
	public Query<T> setSort(Sort sort) {
		this.sort = sort;
		return this;
	}

	@Override
	public Sort getSort() {
		return this.sort;
	}

	@Override
	public Query<T> setBeanType(Class<T> beanType) {
		this.beanType = beanType;
		return this;
	}

	@Override
	public Class<T> getBeanType() {
		return this.beanType;
	}

	@Override
	public Query<T> setExcludeFields(List<String> excludeFields) {
		this.excludeFields = excludeFields;
		return this;
	}

	@Override
	public List<String> getExcludeFields() {
		return this.excludeFields;
	}

	@Override
	public Query<T> setIncludeFields(List<String> includeFields) {
		this.includeFields = includeFields;
		return this;
	}

	@Override
	public List<String> getIncludeFields() {
		return this.includeFields;
	}
}
