package xyz.ieden.cloud.euraka.server.single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerApp
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/20 0:13
 */
@SpringBootApplication
@EnableEurekaServer
public class SingleEurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(SingleEurekaServerApp.class, args);
    }

}
