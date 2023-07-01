package com.github.nramc.thirukural.function.serverlessapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
@Slf4j
public class HelloWorldApi {

    @Bean
    public Function<String, String> echo() {
        return input -> {
            log.info("echo: Request received. [{}]", input);
            return input;
        };
    }

    @Bean
    public Consumer<String> hello() {
        return input -> log.info("hello: Request Received with input [{}]", input);
    }

    @Bean
    public Supplier<String> bye() {
        return () -> {
            log.info("bye: Request Received");
            return "bye";
        };
    }
}
