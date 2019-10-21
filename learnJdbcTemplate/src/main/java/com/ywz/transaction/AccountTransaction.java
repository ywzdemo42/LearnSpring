package com.ywz.transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author yangdong
 * @creat 2019-10-21 15:29
 * @Description:TODO
 */
@Component
@Aspect
public class AccountTransaction {

    @Pointcut("execution(* com.ywz.service.impl.*.*(..))")
    private void pt(){}




}
