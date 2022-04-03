package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * File System operations: create, delete, move ... files and directories
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface FileOps {
    /**
     * name/desc for file operation
     *
     * @return operation name
     */
    String value() default "";
}
