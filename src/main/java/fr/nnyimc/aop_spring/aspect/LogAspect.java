package fr.nnyimc.aop_spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
    @Before("execution(* *(..))")
    public void logBefore() {
        System.out.println("Logging before method is being executed...");
    }
}
