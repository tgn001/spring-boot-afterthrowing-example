package com.techgeeknext.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AfterThrowingAspectExample {

    //could be written as this as well\
    //@AfterThrowing("execution(* com.techgeeknext..*(..)))")
    @AfterThrowing(pointcut = "execution(* com.techgeeknext..*(..)))", throwing = "ex")
    public void logAfterThrowingExceptionCall(Exception ex) throws Throwable {
        log.info("======TECHGEEKNEXT - Spring Boot AOP After Throwing Exception Example ");
        log.info(ex.getMessage());
        //handle exception with business logic like sending notification or default message
    }
}
