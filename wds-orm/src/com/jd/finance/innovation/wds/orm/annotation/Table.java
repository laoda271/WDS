package com.jd.finance.innovation.wds.orm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenminghe on 2017/4/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Table {

	String value() default "";

	boolean isTemporary() default false;

	boolean ifNotExists() default true;

	Index[] indexes() default {};

	String engine() default "";

	String charset() default "utf8";

	String comment() default "";
}
