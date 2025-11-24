package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * AI ignore for method to avoid AI access the method body
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface AiIgnore {
    /**
     * ignore method body to avoid AI access
     *
     * @return comment
     */
    String value() default "";
}
