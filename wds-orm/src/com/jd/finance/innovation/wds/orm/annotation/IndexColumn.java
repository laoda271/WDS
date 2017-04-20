package com.jd.finance.innovation.wds.orm.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenminghe on 2017/4/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface IndexColumn {
	String value();

	int length() default 0;
}
