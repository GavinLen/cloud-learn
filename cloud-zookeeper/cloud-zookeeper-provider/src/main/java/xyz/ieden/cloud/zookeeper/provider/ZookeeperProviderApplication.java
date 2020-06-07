package xyz.ieden.cloud.zookeeper.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProviderApplication
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 14:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProviderApplication.class, args);
    }
}
