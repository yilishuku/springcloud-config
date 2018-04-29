package com.wcy.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Description: <br>
 * @Project: springcloud config <br>
 * @CreateDate: Created in 2018/4/29 19:17 <br>
 * @Author: <a href="836327318@qq.com">wcy</a>
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringBootConfigClientApplication {
    @Value("${spring.config.demo}")
    String configInfo;

    @RequestMapping("/config")
    public String config(){
        return "configInfo:"+configInfo;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigClientApplication.class, args);
    }
}
