package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Receive messages from upstream
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MessageReceive {
    /**
     * name for queue/topic from upstream
     *
     * @return queue/topic name
     */
    String value() default "";
}
