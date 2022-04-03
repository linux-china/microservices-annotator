package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Send message to upstream
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MessageSend {
    /**
     * name for queue/topic from upstream
     *
     * @return queue/topic name
     */
    String value() default "";
}
