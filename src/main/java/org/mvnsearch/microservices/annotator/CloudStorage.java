package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * cloud storage, such as S3, OSS, IPFS, block service ...
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
public @interface CloudStorage {
    /**
     * cloud storage name, such as s3, ipfs, oss
     *
     * @return storage system name
     */
    String value() default "";
}
