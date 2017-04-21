package com.jd.finance.innovation.wds.dal.helper;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by chenminghe on 2017/4/21.
 */
public class AnnotationHelper {
	public static final String DEFAULT_CHARSET = "UTF-8";
	private static final Map<Class<?>,Map<String,AnnotationHolder>> ANNOTATIONHOLDERS_CACHE = new ConcurrentHashMap(new IdentityHashMap());
	private static final Map<Class<?>,List<AnnotationHolder>> ANNOTATIONHOLDER_LIST_CACHE = new ConcurrentHashMap(new IdentityHashMap());
	private static final Map<Class<?>,AnnotationHolder> annotation_primary_annotationholder_cache = new ConcurrentHashMap(new IdentityHashMap());
	private static final String quote = "";
}
