package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Broadcast, such as notification, configuration push
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Broadcast {
    /**
     * broadcast name, such event name
     *
     * @return broadcast name
     */
    String value() default "";
}
