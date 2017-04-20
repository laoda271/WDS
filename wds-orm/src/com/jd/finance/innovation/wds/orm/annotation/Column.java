package com.jd.finance.innovation.wds.orm.annotation;

import com.jd.finance.innovation.wds.orm.enums.DataType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenminghe on 2017/4/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Column {
	String value() default "";

	DataType type() default DataType.VARCHAR;

	boolean unsigned() default false;

	String length() default "";

	boolean notNull() default true;

	String defaultValue() default ""; //需要看看这个是默认值还是什么

	String comment() default "";

	String referenceField() default "";
}
