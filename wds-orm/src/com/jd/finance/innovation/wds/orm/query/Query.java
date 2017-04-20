package com.jd.finance.innovation.wds.orm.query;

import java.io.Serializable;
import java.rmi.server.ServerRef;
import java.util.List;

/**
 * Created by chenminghe on 2017/4/20.
 */
public interface Query <T extends Serializable> extends Serializable{
	Query<T> addComparator(Comparator var1);

	Query<T> removeComparator(Comparator var1);

	Query<T> addAllComparators(List<Comparator> var1);

	Query<T> setComparators(List<Comparator> var1);

	List<Comparator> getComparators();

	Query<T> setLimit(int var1);

	int getLimit();

	Query<T> setLimits(int var1, int var2);

	int[] getLimits();

	Query<T> setSort(Sort var1);

	Sort getSort();

	Query<T> setBeanType(Class<T> var1);

	Class<T> getBeanType();

	Query<T> setExcludeFields(List<String> var1);

	List<String> getExcludeFields();

	Query<T> setIncludeFields(List<String> var1);

	List<String> getIncludeFields();
}
