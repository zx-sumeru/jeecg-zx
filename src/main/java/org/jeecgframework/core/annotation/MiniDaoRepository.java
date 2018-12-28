package org.jeecgframework.core.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author sbdz
 * @date 2018/12/28 8:07
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface MiniDaoRepository {

    @AliasFor(annotation = Component.class)
    String value() default "";

}
