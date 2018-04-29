package com.wcy.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @Description: <br>
 * @Project: eboos <br>
 * @CreateDate: Created in 2018/4/29 17:01 <br>
 * @Author: <a href="836327318@qq.com">wcy</a>
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringBootConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigServerApplication.class, args);
    }
}
