package com.oranfish.house.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Datasource {
    String value() default "houseDataSource";
}
