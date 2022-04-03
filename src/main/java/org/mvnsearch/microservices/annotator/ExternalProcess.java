package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Start external process
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface ExternalProcess {
    /**
     * process or command name, such as node, deno or agent
     *
     * @return process name
     */
    String value() default "";
}
