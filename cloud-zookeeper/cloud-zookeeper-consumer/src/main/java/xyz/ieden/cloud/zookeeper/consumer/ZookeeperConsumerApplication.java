package xyz.ieden.cloud.zookeeper.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ZookeeperConsumer
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 15:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperConsumerApplication.class, args);
    }
}
