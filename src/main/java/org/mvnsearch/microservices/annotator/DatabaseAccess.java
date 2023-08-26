package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Database access, and focus on traditional relation database, such MySQL, PostgreSQL, Oracle ...
 * <p>
 * If it's NoSQL and other products, please consider to use {@link DataAccess}
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
public @interface DatabaseAccess {
    /**
     * data base name, such as mysql, postgres, oracle, sqlite ...
     *
     * @return database name
     */
    String value() default "";
}
