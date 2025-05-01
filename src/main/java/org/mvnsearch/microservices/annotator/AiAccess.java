package org.mvnsearch.microservices.annotator;

import java.lang.annotation.*;

/**
 * AI access, such as completion, embedding, chat, etc.
 *
 * @author linux_china
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface AiAccess {
    /**
     * AI vendor/product/model name, such as OpenAI, ChatGPT, Gemini, etc.
     *
     * @return AI vendor/product/model name
     */
    String value() default "";
}
