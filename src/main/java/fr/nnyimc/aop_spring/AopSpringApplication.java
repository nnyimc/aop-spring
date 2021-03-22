package fr.nnyimc.aop_spring;

import fr.nnyimc.aop_spring.config.Config;
import fr.nnyimc.aop_spring.models.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.doSomething();
    }

}
