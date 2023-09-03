package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * JNI/FFI access.
 *
 * @author linux_china
 * @see <a href="https://openjdk.java.net/jeps/442">JEP 442: Foreign Function & Memory API</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/jni/">Java Native Interface</a>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface ForeignAccess {

    /**
     * name for foreign function, such as jni or ffi, and default is jni
     *
     * @return adapter name
     */
    String value() default "jni";

}
