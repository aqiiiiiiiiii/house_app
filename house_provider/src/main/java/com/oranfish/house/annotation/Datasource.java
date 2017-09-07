package com.oranfish.house.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Datasource {
    String value();
    static final String HOUSE = "house";
    static final String DBGIRL = "dbgirl";
}
