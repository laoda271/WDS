package com.jd.finance.innovation.wds.orm.annotation;

import com.jd.finance.innovation.wds.orm.enums.IndexType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenminghe on 2017/4/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface Index {

	String value() default "#";

	IndexColumn[] columns();

	IndexType type() default IndexType.NULL;
}
