package com.jd.finance.innovation.wds.dal.annotation;

import java.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenminghe on 2017/4/21.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Compoment
public @interface Handler {
}
