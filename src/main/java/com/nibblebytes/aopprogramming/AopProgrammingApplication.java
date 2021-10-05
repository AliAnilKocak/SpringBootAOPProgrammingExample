package com.nibblebytes.aopprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class AopProgrammingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopProgrammingApplication.class, args);
    }

}
