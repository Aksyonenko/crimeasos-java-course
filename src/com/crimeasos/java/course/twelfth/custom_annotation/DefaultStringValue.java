package com.crimeasos.java.course.twelfth.custom_annotation;

import java.lang.annotation.*;

/**
 * Created by Паша on 15.02.2016.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface DefaultStringValue {
    String defaultValue() default "defaultValue";
}


