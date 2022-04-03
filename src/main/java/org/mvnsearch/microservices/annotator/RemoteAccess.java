package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * Remote access.  Such as IPC, Web Workers, Network request: RPC, HTTP ...
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface RemoteAccess {

    /**
     * protocol or name, such as http, grpc, rsocket ...
     *
     * @return protocol
     */
    String value() default "";

}
