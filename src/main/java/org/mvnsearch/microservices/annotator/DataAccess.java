package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Data access, such as NoSQL, cache and other data products.
 * <p>
 * If it's Database, please use {@link DatabaseAccess}
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface DataAccess {
    /**
     * data product name, such as redis, mongodb ...
     *
     * @return data product name
     */
    String value() default "";
}
