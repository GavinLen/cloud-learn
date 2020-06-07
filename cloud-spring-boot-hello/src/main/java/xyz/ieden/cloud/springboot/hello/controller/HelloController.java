package xyz.ieden.cloud.springboot.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 9:53
 */
@RestController
@RequestMapping(value = "hello")
@Slf4j
public class HelloController {

    @GetMapping(value = "")
    public String sayHello() {
        log.info("Sya Hello");
        return "hello world";
    }

}
