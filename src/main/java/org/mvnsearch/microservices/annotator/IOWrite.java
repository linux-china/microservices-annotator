package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * IO Write: OutputStream, Writer
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface IOWrite {
    /**
     * name/desc for IO write
     *
     * @return write name
     */
    String value() default "";
}
