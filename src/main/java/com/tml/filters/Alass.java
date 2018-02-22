package com.tml.filters;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Alass {
    // 是否生效
    boolean validate() default  true;
    // 参数
    String value() default "";
}
