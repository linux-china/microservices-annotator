package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * IO Read: InputStream, Reader
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface IORead {
    /**
     * name/desc for IO read
     *
     * @return read name
     */
    String value() default "";
}
