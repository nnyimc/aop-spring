package fr.nnyimc.aop_spring.models;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

public interface CustomerService {
    public void doSomething();

}
