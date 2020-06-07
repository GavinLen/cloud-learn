package xyz.ieden.cloud.consul.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsulProviderApplication
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 16:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderApplication.class, args);
    }

}
