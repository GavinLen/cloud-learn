package xyz.ieden.cloud.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * HelloApplication
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 9:54
 */
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloApplication.class, args);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach((name) -> {
            System.out.println(name);
        });
    }
}
