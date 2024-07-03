package com.spring.proxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 메소드에 적용할 것
@Retention(RetentionPolicy.RUNTIME) // 에노테이션 정보를 런타임 동안에만 유지할 것
public @interface LogExecutionTime {

}
