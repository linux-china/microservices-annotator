package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Streaming operation, receive input and publish output
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Streaming {
    /**
     * process unit name, such as wordSplitter
     *
     * @return unit name
     */
    String value() default "";
}
