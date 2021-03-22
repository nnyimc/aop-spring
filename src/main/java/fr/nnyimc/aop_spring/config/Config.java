package fr.nnyimc.aop_spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"fr.nnyimc.aop_spring.models","fr.nnyimc.aop_spring.aspect"})
@EnableAspectJAutoProxy
public
class Config {
}
